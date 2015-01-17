 package com.drdanick.McRKit;
 
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.PrintStream;
 import java.util.Properties;
 
 public final class PropertiesFile
 {
   private Properties properties;
   private String fileName;
   
   public PropertiesFile(Properties paramProperties)
   {
     this.properties = paramProperties;
     this.fileName = null;
   }
   
   public void load()
   {
     try
     {
       this.properties.load(new FileInputStream(this.fileName));
     }
     catch (IOException localIOException)
     {
       System.err.println("Unnable to load " + this.fileName + ": " + localIOException.toString());
     }
   }
   
   public void save()
   {
     try
     {
       this.properties.store(new FileOutputStream(this.fileName), "Minecraft Remote Toolkit Properties File");
     }
     catch (IOException localIOException)
     {
       System.err.println("Unnable to save " + this.fileName + ": " + localIOException.toString());
     }
   }
   
   public boolean keyExists(String paramString)
   {
     return this.properties.containsKey(paramString);
   }
   
   public String getString(String paramString)
   {
     return this.properties.getProperty(paramString);
   }
   
   public String getString(String paramString1, String paramString2)
   {
     if (this.properties.containsKey(paramString1)) {
       return this.properties.getProperty(paramString1);
     }
     setString(paramString1, paramString2);
     return paramString2;
   }
   
   public void setString(String paramString1, String paramString2)
   {
     this.properties.setProperty(paramString1, paramString2);
   }
   
   public int getInt(String paramString)
   {
     return Integer.parseInt(this.properties.getProperty(paramString));
   }
   
   public int getInt(String paramString, int paramInt)
   {
     if (this.properties.containsKey(paramString)) {
       return Integer.parseInt(this.properties.getProperty(paramString));
     }
     setInt(paramString, paramInt);
     return paramInt;
   }
   
   public void setInt(String paramString, int paramInt)
   {
     this.properties.setProperty(paramString, String.valueOf(paramInt));
   }
   
   public long getLong(String paramString)
   {
     return Long.parseLong(this.properties.getProperty(paramString));
   }
   
   public long getLong(String paramString, long paramLong)
   {
     if (this.properties.containsKey(paramString)) {
       return Long.parseLong(this.properties.getProperty(paramString));
     }
     setLong(paramString, paramLong);
     return paramLong;
   }
   
   public void setLong(String paramString, long paramLong)
   {
     this.properties.setProperty(paramString, String.valueOf(paramLong));
   }
   
   public boolean getBoolean(String paramString)
   {
     return Boolean.parseBoolean(this.properties.getProperty(paramString));
   }
   
   public boolean getBoolean(String paramString, boolean paramBoolean)
   {
     if (this.properties.containsKey(paramString)) {
       return Boolean.parseBoolean(this.properties.getProperty(paramString));
     }
     setBoolean(paramString, paramBoolean);
     return paramBoolean;
   }
   
   public void setBoolean(String paramString, boolean paramBoolean)
   {
     this.properties.setProperty(paramString, String.valueOf(paramBoolean));
   }
   
   public Properties getProperties()
   {
     return this.properties;
   }
 }


/* Location:           C:\Users\ABC\Downloads\mods\mcrtoolkit10a15_3\serverdir\plugins\MinecraftRKitPlugin.jar
 * Qualified Name:     com.drdanick.McRKit.PropertiesFile
 * JD-Core Version:    0.7.0.1
 */