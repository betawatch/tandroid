package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
