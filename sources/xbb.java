// default package

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xbb extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public xbb(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r15 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r3 == r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r3 != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r3.equals(r11) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r8 = r17;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x025b, code lost:
    
        r3 = r8.next();
        r4 = 2;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r3.equals("group") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r2.b = 0;
        r2.c = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = true;
        r2.g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r3.equals("item") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r2.h != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r3 = r2.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r3 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r3.a.hasSubMenu() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        r2.h = true;
        r2.b(r15.addSubMenu(r2.b, r2.i, r2.j, r2.k).getItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r2.h = true;
        r2.b(r15.add(r2.b, r2.i, r2.j, r2.k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        if (r3.equals("menu") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        r8 = r17;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r10 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        r3 = r17.getName();
        r14 = r3.equals("group");
        r8 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r14 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        r3 = r8.obtainStyledAttributes(r18, jy8.p);
        r2.b = r3.getResourceId(1, 0);
        r2.c = r3.getInt(3, 0);
        r2.d = r3.getInt(4, 0);
        r2.e = r3.getInt(5, 0);
        r2.f = r3.getBoolean(2, true);
        r2.g = r3.getBoolean(0, true);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        if (r3.equals("item") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        r3 = r8.obtainStyledAttributes(r18, jy8.q);
        r2.i = r3.getResourceId(2, 0);
        r2.j = (r3.getInt(5, r2.c) & (-65536)) | (r3.getInt(6, r2.d) & 65535);
        r2.k = r3.getText(7);
        r2.l = r3.getText(8);
        r2.m = r3.getResourceId(0, 0);
        r13 = r3.getString(9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013f, code lost:
    
        if (r13 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        r2.n = r13;
        r2.o = r3.getInt(16, org.telegram.tgnet.TLObject.FLAG_12);
        r13 = r3.getString(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
    
        if (r13 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0161, code lost:
    
        r2.p = r13;
        r2.q = r3.getInt(20, org.telegram.tgnet.TLObject.FLAG_12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0171, code lost:
    
        if (r3.hasValue(11) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0173, code lost:
    
        r2.r = r3.getBoolean(11, false) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        r2.s = r3.getBoolean(3, false);
        r2.t = r3.getBoolean(4, r2.f);
        r2.u = r3.getBoolean(1, r2.g);
        r2.v = r3.getInt(21, -1);
        r2.y = r3.getString(12);
        r2.w = r3.getResourceId(13, 0);
        r2.x = r3.getString(15);
        r4 = r3.getString(14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bb, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bd, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c0, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c4, code lost:
    
        if (r2.w != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c8, code lost:
    
        if (r2.x != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ca, code lost:
    
        r2.z = (d07) r2.a(r4, xbb.f, r16.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e3, code lost:
    
        r2.A = r3.getText(17);
        r2.B = r3.getText(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r3.hasValue(19) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
    
        r2.D = lq3.b(r3.getInt(19, -1), r2.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0211, code lost:
    
        if (r3.hasValue(18) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        if (r3.hasValue(18) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0219, code lost:
    
        r12 = r3.getResourceId(18, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x021d, code lost:
    
        if (r12 == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021f, code lost:
    
        r8 = rr.e(r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0223, code lost:
    
        if (r8 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0229, code lost:
    
        r2.C = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022f, code lost:
    
        r3.recycle();
        r2.h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0225, code lost:
    
        r8 = r3.getColorStateList(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x022c, code lost:
    
        r2.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0208, code lost:
    
        r2.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d7, code lost:
    
        if (r13 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        r9 = false;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d9, code lost:
    
        android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e0, code lost:
    
        r2.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017a, code lost:
    
        r2.r = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015d, code lost:
    
        r13 = r13.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0143, code lost:
    
        r13 = r13.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023a, code lost:
    
        if (r3.equals("menu") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023c, code lost:
    
        r2.h = true;
        r3 = r15.addSubMenu(r2.b, r2.i, r2.j, r2.k);
        r2.b(r3.getItem());
        r8 = r17;
        b(r8, r18, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r9 != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0257, code lost:
    
        r8 = r17;
        r11 = r3;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0262, code lost:
    
        wn4.j("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0267, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r3 == 1) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        wbb wbbVar = new wbb(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            int i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    wn4.j("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof yz6)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
