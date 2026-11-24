// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wy3 extends FrameLayout {
    public final l66 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final cj8 e;
    public final r7 f;
    public final boolean h;
    public final qv0 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ az3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy3(az3 az3Var, Context context, boolean z) {
        super(context);
        float f;
        float f2;
        float f3;
        this.y = az3Var;
        this.n = new qv0(this, (byte) 4);
        final byte b = 0;
        this.s = false;
        this.w = 0.0f;
        this.h = z;
        final byte b2 = 1;
        if (z) {
            f = 32.0f;
        } else {
            Pattern pattern = az3.P1;
            float f4 = 8.0f;
            if (z8c.h(az3Var.a).p()) {
                f2 = 28.0f;
                f3 = 16.0f;
            } else {
                f3 = 16.0f;
                f2 = 28.0f;
                cj8 cj8Var = new cj8(gm.L(4.0f), az3Var.J0, context, false);
                this.e = cj8Var;
                cj8Var.b(jb6.M0(2131743563, null), new View.OnClickListener(this) { // from class: uy3
                    public final /* synthetic */ wy3 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        wy3 wy3Var = this.b;
                        switch (b3) {
                            case 0:
                                az3 az3Var2 = wy3Var.y;
                                az3Var2.K1 = SystemClock.elapsedRealtime();
                                az3Var2.H0();
                                break;
                            case 1:
                                az3.E0(wy3Var.n, wy3Var.r, true, null, null);
                                wy3Var.a(true, true);
                                break;
                            case 2:
                                qv0 qv0Var = wy3Var.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = wy3Var.r;
                                bi3 bi3Var = new bi3(wy3Var, (byte) 29);
                                Pattern pattern2 = az3.P1;
                                if (qv0Var != null && tL_messages_stickerSet != null && qv0Var.getFragmentView() != null) {
                                    hs6.d0(qv0Var.getCurrentAccount()).i2(qv0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qv0Var, null, true, true, bi3Var, true);
                                }
                                wy3Var.a(false, true);
                                break;
                            default:
                                wy3Var.f.U(null, null);
                                break;
                        }
                    }
                }, false);
                cj8Var.setIcon(R.raw.unlock_icon);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cj8Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = gm.L(1.0f);
                marginLayoutParams.topMargin = gm.L(1.0f);
                int L = gm.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) cj8Var.getTextView().getLayoutParams()).leftMargin = gm.L(3.0f);
                cj8Var.getChildAt(0).setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                addView(cj8Var, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                cj8Var.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(gm.L(28.0f), TLObject.FLAG_30));
                f4 = (gm.L(16.0f) + cj8Var.getMeasuredWidth()) / gm.p;
            }
            float f5 = f4;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(gm.o());
            anb.X(textView, cmb.Ii, az3Var.J0);
            int i = cmb.Ei;
            fg0 e = ulb.e(cmb.v0(i, az3Var.J0), 14.0f);
            wmb M = anb.M(i);
            wmb e2 = anb.e(i);
            ylb ylbVar = az3Var.J0;
            textView.setBackground(e);
            anb.j(textView, e, M, e2, ylbVar);
            textView.setText(jb6.M0(2131754483, null));
            textView.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: uy3
                public final /* synthetic */ wy3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    wy3 wy3Var = this.b;
                    switch (b3) {
                        case 0:
                            az3 az3Var2 = wy3Var.y;
                            az3Var2.K1 = SystemClock.elapsedRealtime();
                            az3Var2.H0();
                            break;
                        case 1:
                            az3.E0(wy3Var.n, wy3Var.r, true, null, null);
                            wy3Var.a(true, true);
                            break;
                        case 2:
                            qv0 qv0Var = wy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = wy3Var.r;
                            bi3 bi3Var = new bi3(wy3Var, (byte) 29);
                            Pattern pattern2 = az3.P1;
                            if (qv0Var != null && tL_messages_stickerSet != null && qv0Var.getFragmentView() != null) {
                                hs6.d0(qv0Var.getCurrentAccount()).i2(qv0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qv0Var, null, true, true, bi3Var, true);
                            }
                            wy3Var.a(false, true);
                            break;
                        default:
                            wy3Var.f.U(null, null);
                            break;
                    }
                }
            });
            addView(textView, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(gm.L(f2), TLObject.FLAG_30));
            float max = Math.max(f5, (gm.L(f3) + textView.getMeasuredWidth()) / gm.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(gm.o());
            anb.X(textView2, i, az3Var.J0);
            fg0 Y = cmb.Y(cmb.v0(i, az3Var.J0) & 268435455, 4, 4);
            wmb g = anb.g(i, 15);
            ylb ylbVar2 = az3Var.J0;
            textView2.setBackground(Y);
            anb.j(textView2, Y, null, g, ylbVar2);
            textView2.setText(jb6.M0(2131744544, null));
            textView2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
            textView2.setGravity(17);
            final byte b3 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: uy3
                public final /* synthetic */ wy3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b3;
                    wy3 wy3Var = this.b;
                    switch (b32) {
                        case 0:
                            az3 az3Var2 = wy3Var.y;
                            az3Var2.K1 = SystemClock.elapsedRealtime();
                            az3Var2.H0();
                            break;
                        case 1:
                            az3.E0(wy3Var.n, wy3Var.r, true, null, null);
                            wy3Var.a(true, true);
                            break;
                        case 2:
                            qv0 qv0Var = wy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = wy3Var.r;
                            bi3 bi3Var = new bi3(wy3Var, (byte) 29);
                            Pattern pattern2 = az3.P1;
                            if (qv0Var != null && tL_messages_stickerSet != null && qv0Var.getFragmentView() != null) {
                                hs6.d0(qv0Var.getCurrentAccount()).i2(qv0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qv0Var, null, true, true, bi3Var, true);
                            }
                            wy3Var.a(false, true);
                            break;
                        default:
                            wy3Var.f.U(null, null);
                            break;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(gm.L(f2), TLObject.FLAG_30));
            f = Math.max(max, (gm.L(f3) + textView2.getMeasuredWidth()) / gm.p);
        }
        float f6 = f;
        Pattern pattern2 = az3.P1;
        l66 l66Var = new l66(context, az3Var.J0);
        this.a = l66Var;
        l66Var.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        l66Var.setTypeface(gm.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        l66Var.setEllipsize(truncateAt);
        l66Var.setSingleLine(true);
        l66Var.setLines(1);
        anb.G(l66Var, cmb.I6, az3Var.J0);
        anb.X(l66Var, cmb.i5, az3Var.J0);
        if (!z) {
            l66Var.setTextSize(1, 17.0f);
            addView(l66Var, qoe.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f6, 0.0f));
            TextView textView3 = new TextView(context);
            this.b = textView3;
            textView3.setTextSize(1, 13.0f);
            anb.X(textView3, cmb.p5, az3Var.J0);
            textView3.setEllipsize(truncateAt);
            textView3.setSingleLine(true);
            textView3.setLines(1);
            addView(textView3, qoe.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f6, 0.0f));
            return;
        }
        l66Var.setTextSize(1, 20.0f);
        addView(l66Var, qoe.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f6, 0.0f));
        r7 r7Var = new r7(context, null, 0, cmb.v0(cmb.zj, az3Var.J0), false, az3Var.J0);
        this.f = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setSubMenuOpenSide(2);
        r7Var.setIcon(R.drawable.ic_ab_other);
        int i2 = cmb.Dj;
        fg0 f0 = cmb.f0(cmb.v0(i2, az3Var.J0), 1, -1);
        wmb M2 = anb.M(i2);
        ylb ylbVar3 = az3Var.J0;
        r7Var.setBackground(f0);
        anb.j(r7Var, f0, null, M2, ylbVar3);
        addView(r7Var, qoe.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (az3Var.u0 / gm.p), 0.0f));
        r7Var.e(1, R.drawable.msg_share, jb6.M0(2131744535, null));
        r7Var.e(2, R.drawable.msg_link, jb6.M0(2131751699, null));
        final byte b4 = 3;
        r7Var.setOnClickListener(new View.OnClickListener(this) { // from class: uy3
            public final /* synthetic */ wy3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                wy3 wy3Var = this.b;
                switch (b32) {
                    case 0:
                        az3 az3Var2 = wy3Var.y;
                        az3Var2.K1 = SystemClock.elapsedRealtime();
                        az3Var2.H0();
                        break;
                    case 1:
                        az3.E0(wy3Var.n, wy3Var.r, true, null, null);
                        wy3Var.a(true, true);
                        break;
                    case 2:
                        qv0 qv0Var = wy3Var.n;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = wy3Var.r;
                        bi3 bi3Var = new bi3(wy3Var, (byte) 29);
                        Pattern pattern22 = az3.P1;
                        if (qv0Var != null && tL_messages_stickerSet != null && qv0Var.getFragmentView() != null) {
                            hs6.d0(qv0Var.getCurrentAccount()).i2(qv0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qv0Var, null, true, true, bi3Var, true);
                        }
                        wy3Var.a(false, true);
                        break;
                    default:
                        wy3Var.f.U(null, null);
                        break;
                }
            }
        });
        r7Var.setDelegate(new yu3(az3Var, (byte) 3));
        r7Var.setContentDescription(jb6.M0(2131754838, null));
    }

    public final void a(boolean z, boolean z2) {
        TextView textView;
        if (this.s != z) {
            this.s = z;
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            TextView textView2 = this.c;
            if (textView2 == null || (textView = this.d) == null) {
                return;
            }
            textView2.setClickable(!z);
            textView.setClickable(z);
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z ? 1.0f : 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new et1(this, (byte) 22));
                this.x.setInterpolator(d53.h);
                this.x.setDuration(250L);
                this.x.start();
                return;
            }
            this.w = z ? 1.0f : 0.0f;
            textView2.setScaleX(z ? 0.0f : 1.0f);
            textView2.setScaleY(z ? 0.0f : 1.0f);
            textView2.setAlpha(z ? 0.0f : 1.0f);
            textView.setScaleX(z ? 1.0f : 0.0f);
            textView.setScaleY(z ? 1.0f : 0.0f);
            textView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.h ? 42.0f : 56.0f), TLObject.FLAG_30));
    }
}
