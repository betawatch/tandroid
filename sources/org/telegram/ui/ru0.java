package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ru0 extends org.telegram.ui.Components.q01 {
    public boolean a;
    public float b;
    public NestedScrollView c;
    public FrameLayout d;

    public ru0(Context context) {
        super(context);
        this.a = false;
        this.b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.a && z10) {
            this.c.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.a ? this.b : super.getAlpha();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null || getParent() != this.d) {
            return;
        }
        this.a = true;
        this.c.setVisibility(getVisibility());
        this.c.setAlpha(this.b);
        super.setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a) {
            this.a = false;
            this.c.setVisibility(8);
            super.setAlpha(this.b);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        this.b = f7;
        if (this.a) {
            this.c.setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.c = nestedScrollView;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.a) {
            this.c.invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
