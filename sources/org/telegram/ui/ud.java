package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ud {
    public String b;
    public CharSequence c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public String h;
    public long j;
    public boolean a = true;
    public TL_stars.StarsAmount i = TL_stars.StarsAmount.ofStars(0);

    public static ud a(String str, String str2) {
        ud udVar = new ud();
        udVar.b = str;
        udVar.c = str2;
        return udVar;
    }
}
