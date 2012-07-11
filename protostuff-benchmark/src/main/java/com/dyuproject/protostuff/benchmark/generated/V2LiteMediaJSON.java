// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!

package com.dyuproject.protostuff.benchmark.generated;

import java.io.IOException;
import java.util.HashMap;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite.Builder;

import com.dyuproject.protostuff.json.ProtobufConvertor;
import com.dyuproject.protostuff.json.ProtobufJSON;

import com.dyuproject.protostuff.benchmark.V2LiteMedia.Image;
import com.dyuproject.protostuff.benchmark.V2LiteMedia.Media;
import com.dyuproject.protostuff.benchmark.V2LiteMedia.MediaContent;


public final class V2LiteMediaJSON extends ProtobufJSON
{

    public V2LiteMediaJSON()
    {
        super();
    }

    public V2LiteMediaJSON(JsonFactory factory)
    {
        super(factory);
    }

    @SuppressWarnings("unchecked")
    protected <T extends MessageLite, B extends Builder> ProtobufConvertor<T, B> getConvertor(Class<?> messageType)
    {
        
        if(messageType==Image.class)
            return (ProtobufConvertor<T, B>)CONVERTOR_Image;
        
        if(messageType==Media.class)
            return (ProtobufConvertor<T, B>)CONVERTOR_Media;
        
        if(messageType==MediaContent.class)
            return (ProtobufConvertor<T, B>)CONVERTOR_MediaContent;
        
        return null;
    }

    
    static final ProtobufConvertor<Image,Image.Builder> CONVERTOR_Image = new ProtobufConvertor<Image,Image.Builder>()
    {
        final HashMap<String,Integer> fieldMap = new HashMap<String,Integer>();
        {
                        
            fieldMap.put("uri", 1);
                        
            fieldMap.put("title", 2);
                        
            fieldMap.put("width", 3);
                        
            fieldMap.put("height", 4);
                        
            fieldMap.put("size", 5);
            
        }

        final int getFieldNumber(String name) throws IOException
        {
            Integer num = fieldMap.get(name);
            if(num==null)
                throw new IOException("Field unknown: " + name + " on message " + Image.class);

            return num.intValue();
        }

        public final void generateTo(JsonGenerator generator, Image message) throws IOException
        {
            generator.writeStartObject();
                        
            if(message.hasUri())
                generator.writeStringField("uri", message.getUri());
                                    
            if(message.hasTitle())
                generator.writeStringField("title", message.getTitle());
                                    
            if(message.hasWidth())
                generator.writeNumberField("width", message.getWidth());
                                    
            if(message.hasHeight())
                generator.writeNumberField("height", message.getHeight());
                                    
            if(message.hasSize())
                generator.writeNumberField("size", message.getSize().getNumber());
                        
            generator.writeEndObject();
        }

        public final Image.Builder parseFrom(JsonParser parser) throws IOException
        {
            Image.Builder builder = Image.newBuilder();
            mergeFrom(parser, builder);
            return builder;
        }

        public final void mergeFrom(JsonParser parser, Image.Builder builder) throws IOException
        {
            for(JsonToken t = parser.nextToken(); t!=JsonToken.END_OBJECT; t=parser.nextToken())
            {
                if(t!=JsonToken.FIELD_NAME)
                {
                    throw new IOException("Expected token: field_name but was " + 
                            parser.getCurrentToken() + " on message " + 
                            Image.class);
                }
                String name = parser.getCurrentName();
                switch( getFieldNumber(name) )
                {
                    
                    case 1:
                                                
                        if(parser.nextToken() != JsonToken.VALUE_STRING)
                            throw new IOException("Expected token: string but was " + parser.getCurrentToken());
                        builder.setUri(parser.getText());
                        
                        break;
                    
                    case 2:
                                                
                        if(parser.nextToken() != JsonToken.VALUE_STRING)
                            throw new IOException("Expected token: string but was " + parser.getCurrentToken());
                        builder.setTitle(parser.getText());
                        
                        break;
                    
                    case 3:
                        
                        parser.nextToken();
                        builder.setWidth(parser.getIntValue());
                        
                        break;
                    
                    case 4:
                        
                        parser.nextToken();
                        builder.setHeight(parser.getIntValue());
                        
                        break;
                    
                    case 5:
                        
                        parser.nextToken();
                        builder.setSize(Image.Size.valueOf(parser.getIntValue()));
                        
                        break;
                    
                    default:
                        throw new IOException("Field unknown: " + name + " on message " + Image.class);
                }
            }
        }

    };

    
    static final ProtobufConvertor<Media,Media.Builder> CONVERTOR_Media = new ProtobufConvertor<Media,Media.Builder>()
    {
        final HashMap<String,Integer> fieldMap = new HashMap<String,Integer>();
        {
                        
            fieldMap.put("uri", 1);
                        
            fieldMap.put("title", 2);
                        
            fieldMap.put("width", 3);
                        
            fieldMap.put("height", 4);
                        
            fieldMap.put("format", 5);
                        
            fieldMap.put("duration", 6);
                        
            fieldMap.put("size", 7);
                        
            fieldMap.put("bitrate", 8);
                        
            fieldMap.put("person", 9);
                        
            fieldMap.put("player", 10);
                        
            fieldMap.put("copyright", 11);
            
        }

        final int getFieldNumber(String name) throws IOException
        {
            Integer num = fieldMap.get(name);
            if(num==null)
                throw new IOException("Field unknown: " + name + " on message " + Media.class);

            return num.intValue();
        }

        public final void generateTo(JsonGenerator generator, Media message) throws IOException
        {
            generator.writeStartObject();
                        
            if(message.hasUri())
                generator.writeStringField("uri", message.getUri());
                                    
            if(message.hasTitle())
                generator.writeStringField("title", message.getTitle());
                                    
            if(message.hasWidth())
                generator.writeNumberField("width", message.getWidth());
                                    
            if(message.hasHeight())
                generator.writeNumberField("height", message.getHeight());
                                    
            if(message.hasFormat())
                generator.writeStringField("format", message.getFormat());
                                    
            if(message.hasDuration())
                generator.writeNumberField("duration", message.getDuration());
                                    
            if(message.hasSize())
                generator.writeNumberField("size", message.getSize());
                                    
            if(message.hasBitrate())
                generator.writeNumberField("bitrate", message.getBitrate());
                                    
            generator.writeFieldName("person");
            generator.writeStartArray();
            
            for (String t : message.getPersonList())
                generator.writeString(t);
            
            generator.writeEndArray();
                                    
            if(message.hasPlayer())
                generator.writeNumberField("player", message.getPlayer().getNumber());
                                    
            if(message.hasCopyright())
                generator.writeStringField("copyright", message.getCopyright());
                        
            generator.writeEndObject();
        }

        public final Media.Builder parseFrom(JsonParser parser) throws IOException
        {
            Media.Builder builder = Media.newBuilder();
            mergeFrom(parser, builder);
            return builder;
        }

        public final void mergeFrom(JsonParser parser, Media.Builder builder) throws IOException
        {
            for(JsonToken t = parser.nextToken(); t!=JsonToken.END_OBJECT; t=parser.nextToken())
            {
                if(t!=JsonToken.FIELD_NAME)
                {
                    throw new IOException("Expected token: field_name but was " + 
                            parser.getCurrentToken() + " on message " + 
                            Media.class);
                }
                String name = parser.getCurrentName();
                switch( getFieldNumber(name) )
                {
                    
                    case 1:
                                                
                        if(parser.nextToken() != JsonToken.VALUE_STRING)
                            throw new IOException("Expected token: string but was " + parser.getCurrentToken());
                        builder.setUri(parser.getText());
                        
                        break;
                    
                    case 2:
                                                
                        if(parser.nextToken() != JsonToken.VALUE_STRING)
                            throw new IOException("Expected token: string but was " + parser.getCurrentToken());
                        builder.setTitle(parser.getText());
                        
                        break;
                    
                    case 3:
                        
                        parser.nextToken();
                        builder.setWidth(parser.getIntValue());
                        
                        break;
                    
                    case 4:
                        
                        parser.nextToken();
                        builder.setHeight(parser.getIntValue());
                        
                        break;
                    
                    case 5:
                                                
                        if(parser.nextToken() != JsonToken.VALUE_STRING)
                            throw new IOException("Expected token: string but was " + parser.getCurrentToken());
                        builder.setFormat(parser.getText());
                        
                        break;
                    
                    case 6:
                        
                        parser.nextToken();
                        builder.setDuration(parser.getLongValue());
                        
                        break;
                    
                    case 7:
                        
                        parser.nextToken();
                        builder.setSize(parser.getLongValue());
                        
                        break;
                    
                    case 8:
                        
                        parser.nextToken();
                        builder.setBitrate(parser.getIntValue());
                        
                        break;
                    
                    case 9:
                                                
                        if(parser.nextToken()!=JsonToken.START_ARRAY)
                        {
                            throw new IOException("Expected token: [ but was " + 
                                    parser.getCurrentToken() + " on message " + 
                                    Media.class);
                        }
                        for(JsonToken t1=parser.nextToken(); t1!=JsonToken.END_ARRAY; t1=parser.nextToken())
                        {
                                                        
                            if(t1 != JsonToken.VALUE_STRING)
                                throw new IOException("Expected token: string but was " + t1);
                            builder.addPerson(parser.getText());
                            
                        }
                        
                        break;
                    
                    case 10:
                        
                        parser.nextToken();
                        builder.setPlayer(Media.Player.valueOf(parser.getIntValue()));
                        
                        break;
                    
                    case 11:
                                                
                        if(parser.nextToken() != JsonToken.VALUE_STRING)
                            throw new IOException("Expected token: string but was " + parser.getCurrentToken());
                        builder.setCopyright(parser.getText());
                        
                        break;
                    
                    default:
                        throw new IOException("Field unknown: " + name + " on message " + Media.class);
                }
            }
        }

    };

    
    static final ProtobufConvertor<MediaContent,MediaContent.Builder> CONVERTOR_MediaContent = new ProtobufConvertor<MediaContent,MediaContent.Builder>()
    {
        final HashMap<String,Integer> fieldMap = new HashMap<String,Integer>();
        {
                        
            fieldMap.put("image", 1);
                        
            fieldMap.put("media", 2);
            
        }

        final int getFieldNumber(String name) throws IOException
        {
            Integer num = fieldMap.get(name);
            if(num==null)
                throw new IOException("Field unknown: " + name + " on message " + MediaContent.class);

            return num.intValue();
        }

        public final void generateTo(JsonGenerator generator, MediaContent message) throws IOException
        {
            generator.writeStartObject();
                        
            generator.writeFieldName("image");
            generator.writeStartArray();
            
            for (Image t : message.getImageList())
                CONVERTOR_Image.generateTo(generator, t);
            
            generator.writeEndArray();
                                    
            if (message.hasMedia())
            {
                generator.writeFieldName("media");
                CONVERTOR_Media.generateTo(generator, message.getMedia());
            }
                        
            generator.writeEndObject();
        }

        public final MediaContent.Builder parseFrom(JsonParser parser) throws IOException
        {
            MediaContent.Builder builder = MediaContent.newBuilder();
            mergeFrom(parser, builder);
            return builder;
        }

        public final void mergeFrom(JsonParser parser, MediaContent.Builder builder) throws IOException
        {
            for(JsonToken t = parser.nextToken(); t!=JsonToken.END_OBJECT; t=parser.nextToken())
            {
                if(t!=JsonToken.FIELD_NAME)
                {
                    throw new IOException("Expected token: field_name but was " + 
                            parser.getCurrentToken() + " on message " + 
                            MediaContent.class);
                }
                String name = parser.getCurrentName();
                switch( getFieldNumber(name) )
                {
                    
                    case 1:
                                                
                        if(parser.nextToken()!=JsonToken.START_ARRAY)
                        {
                            throw new IOException("Expected token: [ but was " + 
                                    parser.getCurrentToken() + " on message " + 
                                    MediaContent.class);
                        }
                        for(JsonToken t1=parser.nextToken(); t1!=JsonToken.END_ARRAY; t1=parser.nextToken())
                        {
                                                        
                            builder.addImage(CONVERTOR_Image.parseFrom(parser));
                            
                        }
                        
                        break;
                    
                    case 2:
                        
                        parser.nextToken();
                        builder.setMedia(CONVERTOR_Media.parseFrom(parser));
                        
                        break;
                    
                    default:
                        throw new IOException("Field unknown: " + name + " on message " + MediaContent.class);
                }
            }
        }

    };

    
}
