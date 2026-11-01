package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x40 extends FrameLayout {
    public final RectF D;
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final /* synthetic */ a50 K;
    public final org.telegram.ui.Components.fi0 a;
    public final TextView b;
    public final TLRPC.GroupCallParticipant c;
    public final org.telegram.ui.Components.ci0 d;
    public boolean e;
    public float f;
    public float h;
    public int n;
    public double r;
    public final Paint s;
    public final Paint w;
    public final Path x;
    public final float[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(a50 a50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.K = a50Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.D = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.c = groupCallParticipant;
        this.r = org.telegram.messenger.w3.H(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(R.raw.speaker, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        this.d = ci0Var;
        org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
        this.a = fi0Var;
        fi0Var.setScaleType(ImageView.ScaleType.CENTER);
        fi0Var.setAnimation(ci0Var);
        fi0Var.setTag(this.r == 0.0d ? 1 : null);
        addView(fi0Var, w7.b6.d(-2, 40.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        ci0Var.P(this.r == 0.0d ? 17 : 34);
        ci0Var.N(ci0Var.f - 1, false, true);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Vg, null);
        textView.setTextSize(1, 16.0f);
        double H = org.telegram.messenger.w3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d)) + "%");
        textView.setPadding(org.telegram.messenger.dd.X ? 0 : org.telegram.messenger.i0.L(43.0f), 0, org.telegram.messenger.dd.X ? org.telegram.messenger.i0.L(43.0f) : 0, 0);
        addView(textView, w7.b6.e(-2, -2, (org.telegram.messenger.dd.X ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int H2 = (int) (org.telegram.messenger.w3.H(groupCallParticipant) / 100.0d);
        int i10 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i10 >= fArr.length) {
                return;
            }
            if (H2 > (i10 == 0 ? 0 : i10 == 1 ? 50 : org.telegram.messenger.at.g2)) {
                fArr[i10] = 1.0f;
            } else {
                fArr[i10] = 0.0f;
            }
            i10++;
        }
    }

    public final void a(double d, boolean z10) {
        a50 a50Var = this.K;
        org.telegram.messenger.c cVar = a50Var.k1;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        this.r = d;
        TLRPC.GroupCallParticipant groupCallParticipant = this.c;
        groupCallParticipant.volume = (int) (d * 20000.0d);
        groupCallParticipant.volume_by_admin = false;
        groupCallParticipant.flags |= 128;
        double H = org.telegram.messenger.w3.H(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        this.b.setText(((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d)) + "%");
        VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
        if (z10) {
            long C1 = org.telegram.messenger.kj.C1(groupCallParticipant.peer);
            TLObject Z1 = C1 > 0 ? org.telegram.messenger.wp.r1(cVar.a).Z1(Long.valueOf(C1)) : org.telegram.messenger.wp.r1(cVar.a).L0(Long.valueOf(-C1));
            if (groupCallParticipant.volume == 0) {
                b40 b40Var = a50Var.W4;
                if (b40Var != null) {
                    b40Var.dismiss();
                    a50Var.W4 = null;
                }
                a50Var.f1(true);
                a50Var.z1(groupCallParticipant, C1, a50Var.S0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(Z1, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.r == 0.0d ? 1 : null;
        org.telegram.ui.Components.fi0 fi0Var = this.a;
        if ((fi0Var.getTag() != null || num == null) && (fi0Var.getTag() == null || num != null)) {
            return;
        }
        int i10 = this.r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.ci0 ci0Var = this.d;
        ci0Var.P(i10);
        ci0Var.M(this.r != 0.0d ? 17 : 0);
        ci0Var.start();
        fi0Var.setTag(num);
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x10 = (int) motionEvent.getX();
                    this.n = x10;
                    if (x10 < 0) {
                        this.n = 0;
                    } else if (x10 > getMeasuredWidth()) {
                        this.n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.n / getMeasuredWidth(), true);
                }
                this.J = false;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.e) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f) > viewConfiguration.getScaledTouchSlop()) {
                    this.e = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        int x11 = (int) motionEvent.getX();
                        this.n = x11;
                        if (x11 < 0) {
                            this.n = 0;
                        } else if (x11 > getMeasuredWidth()) {
                            this.n = getMeasuredWidth();
                        }
                        this.J = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.J) {
                int x12 = (int) motionEvent.getX();
                this.n = x12;
                if (x12 < 0) {
                    this.n = 0;
                } else if (x12 > getMeasuredWidth()) {
                    this.n = getMeasuredWidth();
                }
                a(this.n / getMeasuredWidth(), false);
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float L;
        int i11;
        float f7;
        int i12;
        x40 x40Var = this;
        int i13 = x40Var.E;
        double d = x40Var.r;
        if (d < 0.25d) {
            x40Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            x40Var.E = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            x40Var.E = -11688225;
        } else {
            x40Var.E = -11027349;
        }
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (i13 == 0) {
            i10 = x40Var.E;
            x40Var.G = 1.0f;
        } else {
            int S0 = org.telegram.messenger.i0.S0(x40Var.G, 1.0f, x40Var.F, i13);
            if (i13 != x40Var.E) {
                x40Var.G = 0.0f;
                x40Var.F = S0;
            }
            i10 = S0;
        }
        Paint paint = x40Var.s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - x40Var.H;
        if (j10 > 17) {
            j10 = 17;
        }
        x40Var.H = elapsedRealtime;
        float f12 = x40Var.G;
        if (f12 < 1.0f) {
            float f13 = (j10 / 200.0f) + f12;
            x40Var.G = f13;
            if (f13 > 1.0f) {
                x40Var.G = 1.0f;
            } else {
                x40Var.invalidate();
            }
        }
        Path path = x40Var.x;
        path.reset();
        float f14 = 6.0f;
        float L2 = org.telegram.messenger.i0.L(6.0f);
        float[] fArr = x40Var.y;
        fArr[7] = L2;
        fArr[6] = L2;
        int i14 = 1;
        fArr[1] = L2;
        int i15 = 0;
        fArr[0] = L2;
        float L3 = org.telegram.messenger.i0.L(6.0f) * (x40Var.n < org.telegram.messenger.i0.L(12.0f) ? Math.max(0.0f, (x40Var.n - org.telegram.messenger.i0.L(6.0f)) / org.telegram.messenger.i0.L(6.0f)) : 1.0f);
        fArr[5] = L3;
        fArr[4] = L3;
        fArr[3] = L3;
        fArr[2] = L3;
        float f15 = x40Var.n;
        float measuredHeight = x40Var.getMeasuredHeight();
        RectF rectF = x40Var.D;
        rectF.set(0.0f, 0.0f, f15, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int H = (int) (org.telegram.messenger.w3.H(x40Var.c) / 100.0d);
        org.telegram.ui.Components.fi0 fi0Var = x40Var.a;
        int L4 = org.telegram.messenger.i0.L(5.0f) + (fi0Var.getMeasuredWidth() / 2) + fi0Var.getLeft();
        int measuredHeight2 = (fi0Var.getMeasuredHeight() / 2) + fi0Var.getTop();
        int i16 = 0;
        while (true) {
            float[] fArr2 = x40Var.I;
            if (i16 >= fArr2.length) {
                return;
            }
            if (i16 == 0) {
                L = org.telegram.messenger.i0.L(f14);
                f7 = f10;
                i12 = i15;
            } else {
                if (i16 == i14) {
                    L = org.telegram.messenger.i0.L(10.0f);
                    i11 = 50;
                } else {
                    L = org.telegram.messenger.i0.L(14.0f);
                    i11 = org.telegram.messenger.at.g2;
                }
                f7 = f10;
                i12 = i11;
            }
            float f16 = f11;
            float L5 = org.telegram.messenger.i0.L(2.0f);
            float f17 = fArr2[i16];
            float f18 = (f16 - f17) * L5;
            Paint paint2 = x40Var.w;
            paint2.setAlpha((int) (255.0f * f17));
            float f19 = L4;
            float f20 = measuredHeight2;
            rectF.set((f19 - L) + f18, (f20 - L) + f18, (f19 + L) - f18, (f20 + L) - f18);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (H > i12) {
                float f21 = fArr2[i16];
                if (f21 < f16) {
                    float f22 = (j10 / 180.0f) + f21;
                    fArr2[i16] = f22;
                    if (f22 > f16) {
                        fArr2[i16] = f16;
                    }
                    invalidate();
                }
            } else {
                float f23 = fArr2[i16];
                if (f23 > f7) {
                    float f24 = f23 - (j10 / 180.0f);
                    fArr2[i16] = f24;
                    if (f24 < f7) {
                        fArr2[i16] = f7;
                    }
                    invalidate();
                }
            }
            i16++;
            x40Var = this;
            canvas2 = canvas;
            f10 = f7;
            f11 = f16;
            f14 = 6.0f;
            i14 = 1;
            i15 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
        this.n = (int) (View.MeasureSpec.getSize(i10) * this.r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
