package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wd {
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

    public static wd a(String str, String str2) {
        wd wdVar = new wd();
        wdVar.b = str;
        wdVar.c = str2;
        return wdVar;
    }
}
