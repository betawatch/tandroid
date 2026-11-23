package pg;

import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a {
    public final CharSequence a;
    public final int b = 2;
    public final Runnable c;
    public final float d;
    public final float e;
    public final q6 f;

    public a(String str, Runnable runnable) {
        this.a = str;
        this.c = runnable;
    }

    public a(String str) {
        this.a = str;
    }

    public a(String str, float f10, float f11, q6 q6Var) {
        this.a = str;
        this.d = f10;
        this.e = f11;
        this.f = q6Var;
    }
}
