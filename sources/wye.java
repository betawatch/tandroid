// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class wye {
    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static qs b(File file, Context context) {
        nka c;
        qs qsVar = new qs(0);
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
                        if (next == 2 && newPullParser.getName().equals("target") && (c = c(newPullParser, context)) != null) {
                            qsVar.put(c.c.b, c);
                        }
                    }
                }
                fileInputStream.close();
                return qsVar;
            } finally {
            }
        } catch (Exception e) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
            return qsVar;
        }
    }

    public static nka c(XmlPullParser xmlPullParser, Context context) {
        nka nkaVar;
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String a = a(xmlPullParser, "id");
        String a2 = a(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
            return null;
        }
        int parseInt = Integer.parseInt(a(xmlPullParser, "rank"));
        String a3 = a(xmlPullParser, "long_label");
        String a4 = a(xmlPullParser, "disabled_message");
        String a5 = a(xmlPullParser, "component");
        ComponentName unflattenFromString = TextUtils.isEmpty(a5) ? null : ComponentName.unflattenFromString(a5);
        String a6 = a(xmlPullParser, "icon_resource_name");
        String a7 = a(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                nkaVar = null;
                break;
            }
            if (next != 2) {
                nkaVar = null;
                if (next == 3 && xmlPullParser.getName().equals("target")) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("intent")) {
                    String a8 = a(xmlPullParser, "action");
                    String a9 = a(xmlPullParser, "targetPackage");
                    String a10 = a(xmlPullParser, "targetClass");
                    if (a8 == null) {
                        intent = null;
                    } else {
                        intent = new Intent(a8);
                        if (!TextUtils.isEmpty(a9) && !TextUtils.isEmpty(a10)) {
                            intent.setClassName(a9, a10);
                        }
                    }
                    if (intent != null) {
                        arrayList.add(intent);
                    }
                } else if (name.equals("categories")) {
                    String a11 = a(xmlPullParser, "name");
                    if (!TextUtils.isEmpty(a11)) {
                        hashSet.add(a11);
                    }
                }
            }
        }
        hka hkaVar = new hka();
        hkaVar.a = context;
        hkaVar.b = a;
        hkaVar.e = a2;
        hkaVar.m = parseInt;
        if (!TextUtils.isEmpty(a3)) {
            hkaVar.f = a3;
        }
        if (!TextUtils.isEmpty(a4)) {
            hkaVar.g = a4;
        }
        if (unflattenFromString != null) {
            hkaVar.d = unflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            hkaVar.c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            ss ssVar = new ss(0);
            ssVar.addAll(hashSet);
            hkaVar.j = ssVar;
        }
        if (TextUtils.isEmpty(hkaVar.e)) {
            lq5.j("Shortcut must have a non-empty label");
            return nkaVar;
        }
        Intent[] intentArr = hkaVar.c;
        if (intentArr != null && intentArr.length != 0) {
            return new nka(hkaVar, a6, a7);
        }
        lq5.j("Shortcut must have an intent");
        return nkaVar;
    }

    public static void d(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void e(XmlSerializer xmlSerializer, nka nkaVar) {
        xmlSerializer.startTag(null, "target");
        hka hkaVar = nkaVar.c;
        String str = nkaVar.b;
        String str2 = nkaVar.a;
        d(xmlSerializer, "id", hkaVar.b);
        d(xmlSerializer, "short_label", hkaVar.e.toString());
        d(xmlSerializer, "rank", Integer.toString(hkaVar.m));
        if (!TextUtils.isEmpty(hkaVar.f)) {
            d(xmlSerializer, "long_label", hkaVar.f.toString());
        }
        if (!TextUtils.isEmpty(hkaVar.g)) {
            d(xmlSerializer, "disabled_message", hkaVar.g.toString());
        }
        ComponentName componentName = hkaVar.d;
        if (componentName != null) {
            d(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            d(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            d(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr = hkaVar.c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            xmlSerializer.startTag(null, "intent");
            d(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                d(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                d(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : hkaVar.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                d(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
