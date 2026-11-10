package pg;

import org.telegram.ui.Components.k6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a {
    public final CharSequence a;
    public final int b = 2;
    public final Runnable c;
    public final float d;
    public final float e;
    public final k6 f;

    public a(String str, Runnable runnable) {
        this.a = str;
        this.c = runnable;
    }

    public a(String str) {
        this.a = str;
    }

    public a(String str, float f10, float f11, k6 k6Var) {
        this.a = str;
        this.d = f10;
        this.e = f11;
        this.f = k6Var;
    }
}
