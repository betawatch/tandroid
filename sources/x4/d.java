package x4;

import a0.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class d {
    public static volatile ArrayList a;
    public static final Object b = new Object();

    public static String a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static a0.f c(File file, Context context) {
        f f10;
        a0.f fVar = new a0.f(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (file.exists()) {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2 && newPullParser.getName().equals("target") && (f10 = f(newPullParser, context)) != null) {
                            fVar.put(f10.c.b, f10);
                        }
                    }
                }
                fileInputStream.close();
                return fVar;
            } finally {
            }
        } catch (Exception e10) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e10);
            return fVar;
        }
    }

    public static c d(XmlResourceParser xmlResourceParser) {
        String a10 = a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                        break;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    name.getClass();
                    if (name.equals("data")) {
                        a(xmlResourceParser, "scheme");
                        a(xmlResourceParser, "host");
                        a(xmlResourceParser, "port");
                        a(xmlResourceParser, "path");
                        a(xmlResourceParser, "pathPattern");
                        a(xmlResourceParser, "pathPrefix");
                        arrayList.add(new b(a(xmlResourceParser, "mimeType")));
                    } else if (name.equals("category")) {
                        arrayList2.add(a(xmlResourceParser, "name"));
                    }
                }
            } else {
                break;
            }
        }
        if (arrayList.isEmpty() || a10 == null || arrayList2.isEmpty()) {
            return null;
        }
        return new c((b[]) arrayList.toArray(new b[arrayList.size()]), a10, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    public static ArrayList e(Context context) {
        c d;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                Bundle bundle = activityInfo.metaData;
                if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                    ArrayList arrayList2 = new ArrayList();
                    XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                    if (loadXmlMetaData == null) {
                        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
                    }
                    while (true) {
                        try {
                            int next = loadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2 && loadXmlMetaData.getName().equals("share-target") && (d = d(loadXmlMetaData)) != null) {
                                arrayList2.add(d);
                            }
                        } catch (Exception e10) {
                            Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e10);
                        }
                    }
                    loadXmlMetaData.close();
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static f f(XmlPullParser xmlPullParser, Context context) {
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String b10 = b(xmlPullParser, "id");
        String b11 = b(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(b10) || TextUtils.isEmpty(b11)) {
            return null;
        }
        int parseInt = Integer.parseInt(b(xmlPullParser, "rank"));
        String b12 = b(xmlPullParser, "long_label");
        String b13 = b(xmlPullParser, "disabled_message");
        String b14 = b(xmlPullParser, "component");
        ComponentName unflattenFromString = TextUtils.isEmpty(b14) ? null : ComponentName.unflattenFromString(b14);
        String b15 = b(xmlPullParser, "icon_resource_name");
        String b16 = b(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getName().equals("target")) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (name.equals("intent")) {
                        String b17 = b(xmlPullParser, "action");
                        String b18 = b(xmlPullParser, "targetPackage");
                        String b19 = b(xmlPullParser, "targetClass");
                        if (b17 == null) {
                            intent = null;
                        } else {
                            intent = new Intent(b17);
                            if (!TextUtils.isEmpty(b18) && !TextUtils.isEmpty(b19)) {
                                intent.setClassName(b18, b19);
                            }
                        }
                        if (intent != null) {
                            arrayList.add(intent);
                        }
                    } else if (name.equals("categories")) {
                        String b20 = b(xmlPullParser, "name");
                        if (!TextUtils.isEmpty(b20)) {
                            hashSet.add(b20);
                        }
                    }
                }
            } else {
                break;
            }
        }
        g0.b bVar = new g0.b();
        bVar.a = context;
        bVar.b = b10;
        bVar.e = b11;
        bVar.m = parseInt;
        if (!TextUtils.isEmpty(b12)) {
            bVar.f = b12;
        }
        if (!TextUtils.isEmpty(b13)) {
            bVar.g = b13;
        }
        if (unflattenFromString != null) {
            bVar.d = unflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            bVar.c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            g gVar = new g(0);
            gVar.addAll(hashSet);
            bVar.j = gVar;
        }
        if (TextUtils.isEmpty(bVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = bVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return new f(bVar, b15, b16);
    }

    public static void g(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void h(XmlSerializer xmlSerializer, f fVar) {
        xmlSerializer.startTag(null, "target");
        g0.b bVar = fVar.c;
        String str = fVar.b;
        String str2 = fVar.a;
        g(xmlSerializer, "id", bVar.b);
        g(xmlSerializer, "short_label", bVar.e.toString());
        g(xmlSerializer, "rank", Integer.toString(bVar.m));
        if (!TextUtils.isEmpty(bVar.f)) {
            g(xmlSerializer, "long_label", bVar.f.toString());
        }
        if (!TextUtils.isEmpty(bVar.g)) {
            g(xmlSerializer, "disabled_message", bVar.g.toString());
        }
        ComponentName componentName = bVar.d;
        if (componentName != null) {
            g(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            g(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            g(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr = bVar.c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            xmlSerializer.startTag(null, "intent");
            g(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : bVar.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                g(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
