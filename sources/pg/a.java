package pg;

import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a {
    public final CharSequence a;
    public final int b = 2;
    public final Runnable c;
    public final float d;
    public final float e;
    public final p6 f;

    public a(String str, Runnable runnable) {
        this.a = str;
        this.c = runnable;
    }

    public a(String str) {
        this.a = str;
    }

    public a(String str, float f10, float f11, p6 p6Var) {
        this.a = str;
        this.d = f10;
        this.e = f11;
        this.f = p6Var;
    }
}
