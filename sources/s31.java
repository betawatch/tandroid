// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s31 extends o21 implements vlb {
    public final ylb a;
    public Runnable b;
    public Runnable c;
    public u31 d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public s31(ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        float f;
        this.a = ylbVar;
        int i = cmb.wj;
        int h = ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
        if (z) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(cmb.f0((h & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            ts2.s(textView, 1, 14.0f);
            wi8.x(textView, i, ylbVar, null, 2131743572);
            textView.setGravity(16);
            float f2 = z2 ? 34.0f : 12.0f;
            if (jb6.a0) {
                f = 12.0f;
            } else {
                f = f2;
                f2 = 12.0f;
            }
            vze.a(textView, f, 8.0f, f2, 8.0f);
            addView(textView, qoe.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z2) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            anb.s(imageView, i, ylbVar, PorterDuff.Mode.MULTIPLY);
            if (!z) {
                imageView.setBackground(cmb.f0((h & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            vze.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, qoe.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new j1(this, (byte) 25));
    }

    @Override // t21
    public final void c() {
        this.d = null;
        Runnable runnable = this.c;
        if (runnable == null || this.f) {
            return;
        }
        runnable.run();
    }

    @Override // t21
    public final void d(u31 u31Var) {
        this.d = u31Var;
    }

    public final void e(String str) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f = true;
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
            u31 u31Var = this.d;
            if (u31Var != null) {
                u31Var.b();
            }
        }
    }

    @Override // vlb
    public final void updateColors() {
        Drawable drawable;
        try {
            int i = cmb.wj;
            ylb ylbVar = this.a;
            int h = ((ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                cmb.F1(drawable, h, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                cmb.F1(drawable2, h, true);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public s31(ylb ylbVar, Context context, boolean z) {
        this(ylbVar, context, z, !z);
    }
}
