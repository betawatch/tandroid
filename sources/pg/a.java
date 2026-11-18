package pg;

import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
