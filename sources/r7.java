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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r7 extends FrameLayout implements s84, snb {
    public int E;
    public int F;
    public zm2 G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final fm0 a;
    public zm2 b;
    public final de0 c;
    public final ImageView d;
    public final TextView e;
    public ph4 f;
    public final c1 h;
    public final vnb n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public zm2 y;

    public r7(Context context, vnb vnbVar) {
        super(context);
        this.a = new fm0(0, this, k43.h, 380L, false);
        this.h = new c1(this, (byte) 4);
        this.n = vnbVar;
        de0 de0Var = new de0(context);
        this.c = de0Var;
        addView(de0Var, tre.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, tre.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, tre.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = hl.L(28.0f);
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i, i, aob.l0(this.w));
        super.dispatchDraw(canvas);
    }

    public ph4 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(135.0f), TLObject.FLAG_31), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setData(ph4 ph4Var) {
        this.f = ph4Var;
        this.s = false;
        String str = ph4Var.c;
        if (str == null) {
            str = ob6.M0(ph4Var.b, null);
        }
        this.e.setText(str);
        zm2 M = aob.M(hl.L(32.0f), ph4Var.a);
        this.b = M;
        int i = aob.Fi;
        vnb vnbVar = this.n;
        aob.z1(M, aob.v0(i, vnbVar), false);
        zm2 zm2Var = this.b;
        int i2 = aob.Ji;
        aob.z1(zm2Var, aob.v0(i2, vnbVar), true);
        byte b = ph4Var.d;
        de0 de0Var = this.c;
        if (b != 4) {
            if (b != 7) {
                de0Var.setImageDrawable(this.b);
                return;
            }
            zm2 M2 = aob.M(hl.L(32.0f), R.drawable.chats_archive);
            int L = hl.L(16.0f);
            int L2 = hl.L(16.0f);
            M2.e = L;
            M2.f = L2;
            aob.z1(M2, aob.v0(i, vnbVar), false);
            aob.z1(M2, aob.v0(i2, vnbVar), true);
            de0Var.setImageDrawable(M2);
            this.y = M2;
            this.E = aob.v0(i, vnbVar);
            this.F = aob.v0(i2, vnbVar);
            return;
        }
        TLObject tLObject = ph4Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = xc2.Y(chat);
                ImageReceiver imageReceiver = de0Var.getImageReceiver();
                int L3 = hl.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.q0(L3);
                de0Var.getImageReceiver().U(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (yac.h(yac.t0).f().id != user.id) {
            de0Var.getImageReceiver().q0(hl.L(16.0f));
            de0Var.getImageReceiver().U(user, this.b, null);
            return;
        }
        zm2 M3 = aob.M(hl.L(32.0f), R.drawable.chats_saved);
        int L4 = hl.L(16.0f);
        int L5 = hl.L(16.0f);
        M3.e = L4;
        M3.f = L5;
        aob.z1(M3, aob.v0(i, vnbVar), false);
        aob.z1(M3, aob.v0(i2, vnbVar), true);
        de0Var.setImageDrawable(M3);
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
        fm0 fm0Var = this.a;
        if (fm0Var.f != z) {
            c1 c1Var = this.h;
            hl.r(c1Var);
            fm0Var.a(z, true);
            if (z) {
                hl.d3(c1Var, 2000L);
            }
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override // snb
    public final void updateColors() {
        float f = this.a.e;
        boolean z = this.r;
        vnb vnbVar = this.n;
        int p1 = z ? aob.p1(0.075f, aob.v0(aob.G6, vnbVar)) : aob.v0(aob.Ti, vnbVar);
        int i = aob.Fi;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.G6, vnbVar);
        int i2 = aob.Ji;
        int v03 = aob.v0(i2, vnbVar);
        this.w = vm2.f(f, p1, v0);
        this.e.setTextColor(vm2.f(f, v02, v03));
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
        int v04 = aob.v0(i, vnbVar);
        int v05 = aob.v0(i2, vnbVar);
        zm2 zm2Var = this.b;
        if (zm2Var != null && (zm2Var != this.G || v04 != this.H || v05 != this.I)) {
            aob.z1(zm2Var, v04, false);
            aob.z1(this.b, v05, true);
            this.G = this.b;
            this.H = v04;
            this.I = v05;
        }
        float f3 = 1.0f - f;
        de0 de0Var = this.c;
        de0Var.setAlpha(f3);
        ph4 ph4Var = this.f;
        if (ph4Var != null && ph4Var.d == 7) {
            zm2 zm2Var2 = this.y;
            if (zm2Var2 == null) {
                setData(ph4Var);
            } else if (v04 != this.E || v05 != this.F) {
                aob.z1(zm2Var2, v04, false);
                aob.z1(this.y, v05, true);
                this.E = v04;
                this.F = v05;
                de0Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
