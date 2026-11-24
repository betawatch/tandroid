// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q7 extends FrameLayout implements g94, vlb {
    public int E;
    public int F;
    public sn2 G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final fn0 a;
    public sn2 b;
    public final bf0 c;
    public final ImageView d;
    public final TextView e;
    public sh4 f;
    public final b1 h;
    public final ylb n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public sn2 y;

    public q7(Context context, ylb ylbVar) {
        super(context);
        this.a = new fn0(0, this, d53.h, 380L, false);
        this.h = new b1(this, (byte) 4);
        this.n = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        addView(bf0Var, qoe.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, qoe.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, qoe.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = gm.L(28.0f);
        updateColors();
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i, i, cmb.l0(this.w));
        super.dispatchDraw(canvas);
    }

    public sh4 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(135.0f), TLObject.FLAG_31), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setData(sh4 sh4Var) {
        this.f = sh4Var;
        this.s = false;
        String str = sh4Var.c;
        if (str == null) {
            str = jb6.M0(sh4Var.b, null);
        }
        this.e.setText(str);
        sn2 M = cmb.M(gm.L(32.0f), sh4Var.a);
        this.b = M;
        int i = cmb.Ei;
        ylb ylbVar = this.n;
        cmb.z1(M, cmb.v0(i, ylbVar), false);
        sn2 sn2Var = this.b;
        int i2 = cmb.Ii;
        cmb.z1(sn2Var, cmb.v0(i2, ylbVar), true);
        byte b = sh4Var.d;
        bf0 bf0Var = this.c;
        if (b != 4) {
            if (b != 7) {
                bf0Var.setImageDrawable(this.b);
                return;
            }
            sn2 M2 = cmb.M(gm.L(32.0f), R.drawable.chats_archive);
            int L = gm.L(16.0f);
            int L2 = gm.L(16.0f);
            M2.e = L;
            M2.f = L2;
            cmb.z1(M2, cmb.v0(i, ylbVar), false);
            cmb.z1(M2, cmb.v0(i2, ylbVar), true);
            bf0Var.setImageDrawable(M2);
            this.y = M2;
            this.E = cmb.v0(i, ylbVar);
            this.F = cmb.v0(i2, ylbVar);
            return;
        }
        TLObject tLObject = sh4Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = sd2.Y(chat);
                ImageReceiver imageReceiver = bf0Var.getImageReceiver();
                int L3 = gm.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.q0(L3);
                bf0Var.getImageReceiver().U(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (z8c.h(z8c.t0).f().id != user.id) {
            bf0Var.getImageReceiver().q0(gm.L(16.0f));
            bf0Var.getImageReceiver().U(user, this.b, null);
            return;
        }
        sn2 M3 = cmb.M(gm.L(32.0f), R.drawable.chats_saved);
        int L4 = gm.L(16.0f);
        int L5 = gm.L(16.0f);
        M3.e = L4;
        M3.f = L5;
        cmb.z1(M3, cmb.v0(i, ylbVar), false);
        cmb.z1(M3, cmb.v0(i2, ylbVar), true);
        bf0Var.setImageDrawable(M3);
    }

    public void setExpanded(boolean z) {
        TextView textView = this.e;
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            setSelectedForDelete(false);
        }
    }

    public void setSelectedForDelete(boolean z) {
        fn0 fn0Var = this.a;
        if (fn0Var.f != z) {
            b1 b1Var = this.h;
            gm.r(b1Var);
            fn0Var.a(z, true);
            if (z) {
                gm.d3(b1Var, 2000L);
            }
        }
    }

    @Override // vlb
    public final void updateColors() {
        float f = this.a.e;
        boolean z = this.r;
        ylb ylbVar = this.n;
        int p1 = z ? cmb.p1(0.075f, cmb.v0(cmb.F6, ylbVar)) : cmb.v0(cmb.Si, ylbVar);
        int i = cmb.Ei;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.F6, ylbVar);
        int i2 = cmb.Ii;
        int v03 = cmb.v0(i2, ylbVar);
        this.w = on2.f(f, p1, v0);
        this.e.setTextColor(on2.f(f, v02, v03));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.J || this.K != v03) {
            imageView.setColorFilter(v03);
            this.J = imageView.getColorFilter();
            this.K = v03;
        }
        imageView.setAlpha(f);
        float f2 = 0.82f * f;
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        int v04 = cmb.v0(i, ylbVar);
        int v05 = cmb.v0(i2, ylbVar);
        sn2 sn2Var = this.b;
        if (sn2Var != null && (sn2Var != this.G || v04 != this.H || v05 != this.I)) {
            cmb.z1(sn2Var, v04, false);
            cmb.z1(this.b, v05, true);
            this.G = this.b;
            this.H = v04;
            this.I = v05;
        }
        float f3 = 1.0f - f;
        bf0 bf0Var = this.c;
        bf0Var.setAlpha(f3);
        sh4 sh4Var = this.f;
        if (sh4Var != null && sh4Var.d == 7) {
            sn2 sn2Var2 = this.y;
            if (sn2Var2 == null) {
                setData(sh4Var);
            } else if (v04 != this.E || v05 != this.F) {
                cmb.z1(sn2Var2, v04, false);
                cmb.z1(this.y, v05, true);
                this.E = v04;
                this.F = v05;
                bf0Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
