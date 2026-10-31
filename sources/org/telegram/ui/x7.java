package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x7 extends s4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x7(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i10, boolean z10) {
        int C;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        org.telegram.messenger.hj hjVar;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.gb;
            org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.w2 != null) {
                    q1Var.P2(true);
                    org.telegram.messenger.vv vvVar = messageObject.w2;
                    ArrayList arrayList2 = vvVar.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) vvVar.o.get(size)).intValue();
                        if (i10 < intValue) {
                            size--;
                        } else {
                            Layout a2 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).a();
                            if (a2 != null) {
                                int lineForOffset = a2.getLineForOffset(Math.min(i10 - intValue, a2.getText().length()));
                                return ((org.telegram.ui.Cells.u9) arrayList2.get(size)).getY() + q1Var.t0 + (z10 ? a2.getLineBottom(lineForOffset) : a2.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.d1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (hjVar = q1Var.k3) == null) {
                        q1Var.P2(true);
                        int i11 = q1Var.t0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.z2;
                        C = q1Var.t1 ? org.telegram.messenger.m5.C(10.0f, q1Var.U1, i11) : i11;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        C = (int) q1Var.r3;
                        charSequence = messageObject.z;
                        arrayList = hjVar.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i12);
                            StaticLayout staticLayout = gjVar.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i13 = gjVar.n;
                            if (i10 > i13) {
                                if (i10 - i13 > charSequence3.length() - 1) {
                                    lineBottom = C + ((int) (gjVar.p(arrayList, x1Var) + gjVar.f + gjVar.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i10 - gjVar.n);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + gjVar.p(arrayList, x1Var) + C + gjVar.f;
                                }
                                return (int) lineBottom;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // s4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).e3.size();
            case 2:
                return ((org.telegram.ui.Components.l8) this.d).e3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.lj ljVar = ((org.telegram.ui.Components.ua0) this.d).r;
                if (ljVar == null) {
                    return 0;
                }
                return ljVar.f.size();
            default:
                return ((sn0) this.d).f.size();
        }
    }

    @Override // s4.g0
    public long c(int i10) {
        switch (this.c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i10 / 12)) * 100) + (h8Var.J - (i10 % 12));
            case 1:
            default:
                return super.c(i10);
            case 2:
                if (i10 >= ((org.telegram.ui.Components.l8) this.d).e3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.k8) r0.e3.get(i10)).a;
        }
    }

    @Override // s4.g0
    public int d(int i10) {
        switch (this.c) {
            case 2:
                return i10 >= ((org.telegram.ui.Components.l8) this.d).e3.size() ? 1 : 0;
            case 5:
                return 0;
            default:
                return super.d(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, java.lang.Object, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        SparseArray sparseArray;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14 = this.c;
        ?? r42 = 0;
        Object obj = this.d;
        switch (i14) {
            case 0:
                e8 e8Var = (e8) c1Var.a;
                h8 h8Var = (h8) obj;
                int i15 = h8Var.I - (i10 / 12);
                int i16 = h8Var.J - (i10 % 12);
                if (i16 < 0) {
                    i16 += 12;
                    i15--;
                }
                if (e8Var.b == i15) {
                    int i17 = e8Var.c;
                }
                SparseArray sparseArray2 = (SparseArray) h8Var.S.get((i15 * 100) + i16);
                h8 h8Var2 = e8Var.y;
                boolean z12 = (i15 == e8Var.b && i16 == e8Var.c) ? false : true;
                e8Var.b = i15;
                e8Var.c = i16;
                e8Var.n = sparseArray2;
                if (z12 && e8Var.r != null) {
                    for (int i18 = 0; i18 < e8Var.r.size(); i18++) {
                        ((ImageReceiver) e8Var.r.valueAt(i18)).R();
                        ((ImageReceiver) e8Var.r.valueAt(i18)).H0(null);
                    }
                    e8Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (e8Var.r == null) {
                        e8Var.r = new SparseArray();
                    }
                    int i19 = 0;
                    while (i19 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i19);
                        if (e8Var.r.get(keyAt, r42) == null && ((f8) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(r42);
                            imageReceiver.H0(e8Var);
                            org.telegram.messenger.jj jjVar = ((f8) sparseArray2.get(keyAt)).a;
                            if (jjVar != null) {
                                boolean t22 = jjVar.t2();
                                if (org.telegram.messenger.jj.L4(jjVar.k)) {
                                    TLRPC.Document F0 = jjVar.F0();
                                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F0.thumbs, 50, false, r42, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F0.thumbs, org.telegram.messenger.zs.r5, false, r42, false);
                                    if (w9 == w10) {
                                        w10 = r42;
                                    }
                                    if (w9 != null) {
                                        if (jjVar.G1 != null) {
                                            imageReceiver.q0(org.telegram.messenger.ic.c(w10, F0), t22 ? "5_5_b" : "44_44", jjVar.G1, null, jjVar, 0);
                                        } else {
                                            imageReceiver.t0(org.telegram.messenger.ic.c(w10, F0), t22 ? "5_5_b" : "44_44", org.telegram.messenger.ic.c(w9, F0), "b", null, jjVar, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = jjVar.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !jjVar.n0.isEmpty()) {
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(jjVar.n0, 50, false, r42, false);
                                        TLRPC.PhotoSize w12 = org.telegram.messenger.b8.w(jjVar.n0, org.telegram.messenger.zs.r5, false, w11, false);
                                        if (!jjVar.x0) {
                                            i11 = ((org.telegram.ui.ActionBar.k2) h8Var2).currentAccount;
                                            if (!org.telegram.messenger.b6.q(i11).d(jjVar)) {
                                                BitmapDrawable bitmapDrawable = jjVar.G1;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.q0(null, null, bitmapDrawable, null, jjVar, 0);
                                                } else {
                                                    imageReceiver.t0(null, null, org.telegram.messenger.ic.f(w11, jjVar.l0), "b", null, jjVar, 0);
                                                }
                                            }
                                        }
                                        if (w12 == w11) {
                                            w11 = r42;
                                        }
                                        if (jjVar.G1 != null) {
                                            imageReceiver.r0(org.telegram.messenger.ic.f(w12, jjVar.l0), t22 ? "5_5_b" : "44_44", null, null, jjVar.G1, w12 != null ? w12.size : 0L, null, jjVar, org.telegram.messenger.jj.Q5(jjVar.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.r0(org.telegram.messenger.ic.f(w12, jjVar.l0), t22 ? "5_5_b" : "44_44", org.telegram.messenger.ic.f(w11, jjVar.l0), "b", null, w12 != null ? w12.size : 0L, null, jjVar, org.telegram.messenger.jj.Q5(jjVar.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.J0(org.telegram.messenger.i0.L(22.0f));
                                e8Var.r.put(keyAt, imageReceiver);
                                i19++;
                                sparseArray2 = sparseArray;
                                r42 = 0;
                            }
                        }
                        sparseArray = sparseArray2;
                        i19++;
                        sparseArray2 = sparseArray;
                        r42 = 0;
                    }
                }
                int i20 = i16 + 1;
                e8Var.d = YearMonth.of(i15, i20).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i15, i16, 0);
                e8Var.e = (calendar.get(7) + 6) % 7;
                e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i21 = e8Var.d + e8Var.e;
                e8Var.f = ((int) (i21 / 7.0f)) + (i21 % 7 == 0 ? 0 : 1);
                calendar.set(i15, i20, 0);
                e8Var.a.l(org.telegram.messenger.cd.e0(calendar.getTimeInMillis() / 1000, true), false);
                h8Var2.z0(e8Var, false);
                e8.a(e8Var, h8Var.P, h8Var.Q);
                e8.b(e8Var, 1.0f);
                h8Var.z0(e8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) c1Var.a;
                ba0 ba0Var = (ba0) ((org.telegram.ui.Cells.t) obj).e3.get(i10);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i22 = ba0Var.b;
                int i23 = ba0Var.d;
                qVar.setImageResource(i22);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!ba0Var.e || org.telegram.messenger.d20.o()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(org.telegram.messenger.cd.L0(i23, null));
                } else {
                    SpannableString spannableString = new SpannableString(a1.g.m(null, i23, new StringBuilder("d ")));
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.msg_mini_premiumlock, 0);
                    dqVar.n = 1;
                    dqVar.c(org.telegram.messenger.i0.L(13.0f));
                    spannableString.setSpan(dqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(w7.j6.a(ba0Var), false);
                int L = org.telegram.messenger.i0.L(18.0f);
                int i24 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.ActionBar.a7.R(qVar, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, org.telegram.ui.ActionBar.t6.x0(null, i24, false), -16777216), null, org.telegram.ui.ActionBar.a7.N(i24), null);
                qVar.setForeground(ba0Var.c);
                break;
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) obj;
                org.telegram.ui.Components.o8 o8Var = l8Var.j3;
                ArrayList arrayList = l8Var.e3;
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) c1Var.a;
                if (c1Var.f != 0) {
                    m8Var.d = true;
                    i12 = ((org.telegram.ui.ActionBar.k2) o8Var).currentAccount;
                    boolean z13 = !org.telegram.messenger.d20.i(i12).q();
                    if (m8Var.w != z13) {
                        m8Var.w = z13;
                        m8Var.invalidate();
                    }
                    m8Var.a = l8Var.i3;
                    z10 = l8Var.g3 == 1;
                    if (m8Var.c != z10) {
                        m8Var.c = z10;
                        m8Var.invalidate();
                        break;
                    }
                } else {
                    m8Var.d = false;
                    org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) arrayList.get(i10);
                    if (k8Var.b) {
                        i13 = ((org.telegram.ui.ActionBar.k2) o8Var).currentAccount;
                        if (!org.telegram.messenger.d20.i(i13).q()) {
                            z11 = true;
                            if (m8Var.w != z11) {
                                m8Var.w = z11;
                                m8Var.invalidate();
                            }
                            m8Var.a = k8Var;
                            z10 = l8Var.g3 == ((org.telegram.ui.Components.k8) arrayList.get(i10)).a;
                            if (m8Var.c == z10) {
                                m8Var.c = z10;
                                m8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (m8Var.w != z11) {
                    }
                    m8Var.a = k8Var;
                    if (l8Var.g3 == ((org.telegram.ui.Components.k8) arrayList.get(i10)).a) {
                    }
                    if (m8Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) obj;
                ag.b1 b1Var = ua0Var.f;
                int i25 = ua0Var.a;
                org.telegram.messenger.lj ljVar = ua0Var.r;
                if (ljVar != null && c1Var.f == 0) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) c1Var.a;
                    q1Var.setInvalidateSpoilersParent(ljVar.i);
                    q1Var.u3(b1Var.getMeasuredWidth(), b1Var.getMeasuredHeight());
                    int f12 = q1Var.getMessageObject() != null ? q1Var.getMessageObject().f1() : 0;
                    if (i25 == 2) {
                        ua0Var.c0.d.b((org.telegram.messenger.jj) ua0Var.r.f.get(i10));
                    }
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) ua0Var.r.f.get(i10);
                    org.telegram.messenger.lj ljVar2 = ua0Var.r;
                    q1Var.s3(jjVar2, (org.telegram.messenger.ej) ljVar2.d.get(((org.telegram.messenger.jj) ljVar2.f.get(i10)).d1()), true, true, false, false);
                    if (i25 == 1) {
                        q1Var.setDelegate(new oa.d(14));
                    }
                    if (ua0Var.r.f.size() > 1) {
                        q1Var.f3(i25 == 1, false);
                        boolean z14 = f12 == ((org.telegram.messenger.jj) ua0Var.r.f.get(i10)).f1();
                        org.telegram.messenger.lj ljVar3 = ua0Var.r;
                        boolean z15 = ljVar3.g.get(((org.telegram.messenger.jj) ljVar3.f.get(i10)).f1(), false);
                        q1Var.h3(z15, z15, z14);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) c1Var.a;
                sn0 sn0Var = (sn0) obj;
                textView2.setText((CharSequence) sn0Var.f.get(i10));
                textView2.setTextColor(i10 == sn0Var.d ? sn0Var.E : sn0Var.D);
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.ck0(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                org.telegram.ui.Cells.s sVar = new org.telegram.ui.Cells.s(context);
                Paint paint = new Paint(1);
                sVar.a = paint;
                Paint paint2 = new Paint(1);
                sVar.b = paint2;
                sVar.setOrientation(1);
                sVar.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                sVar.c = qVar;
                qVar.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                sVar.addView(qVar, w7.b6.r(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                sVar.addView(textView, w7.b6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.i0.L(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.ck0(sVar);
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.d;
                return new org.telegram.ui.Components.ck0(new org.telegram.ui.Components.m8(l8Var.j3, l8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.ck0(((org.telegram.ui.Components.jm) this.d).w);
            case 4:
                return new org.telegram.ui.Components.ck0(new bi.t0(this, ((org.telegram.ui.Components.kn) this.d).getContext(), 11));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) this.d;
                org.telegram.ui.Components.ab0 ab0Var = ua0Var.c0;
                org.telegram.ui.Components.sa0 sa0Var = new org.telegram.ui.Components.sa0(this, context2, ab0Var.x, ua0Var.J, ab0Var.F);
                sa0Var.setClipChildren(false);
                sa0Var.setClipToPadding(false);
                sa0Var.setDelegate(new org.telegram.ui.Components.ta0(this));
                return new org.telegram.ui.Components.ck0(sa0Var);
            default:
                org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(viewGroup.getContext(), null);
                p80Var.setGravity(17);
                p80Var.setTypeface(org.telegram.messenger.i0.o());
                p80Var.setTextSize(1, 14.0f);
                p80Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine();
                p80Var.setMaxLines(1);
                p80Var.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(28.0f)));
                w7.e6.b(p80Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.ck0(p80Var);
        }
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        int i10;
        int i11;
        switch (this.c) {
            case 5:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) this.d;
                org.telegram.ui.Components.oa0 oa0Var = ua0Var.e;
                org.telegram.ui.Components.ab0 ab0Var = ua0Var.c0;
                if (ua0Var.r != null && (i10 = ua0Var.a) != 1) {
                    View view = c1Var.a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i10 != 0) {
                            q1Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            org.telegram.messenger.ej a2 = org.telegram.ui.Components.ua0.a(ua0Var, q1Var.getMessageObject());
                            q1Var.setDrawSelectionBackground(a2 == null);
                            q1Var.h3(true, a2 == null, false);
                            org.telegram.messenger.nj njVar = ab0Var.d;
                            if (!njVar.i && njVar.d != null && ua0Var.e(q1Var)) {
                                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.nj njVar2 = ab0Var.d;
                                org.telegram.messenger.nj njVar3 = ab0Var.d;
                                kn knVar = njVar3.d;
                                if (knVar.m && messageObject != null && messageObject.w2 != null && ((i11 = njVar3.e) < 0 || njVar3.f <= i11)) {
                                    String str = knVar.i;
                                    int[] f7 = str == null ? null : org.telegram.messenger.zv.f(messageObject, str, knVar.o);
                                    if (f7 != null) {
                                        njVar2.e = f7[0];
                                        njVar2.f = f7[1];
                                    } else {
                                        njVar2.e = 0;
                                        njVar2.f = Math.min(org.telegram.messenger.vp.r1(ab0Var.x).p4, kn.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.nj njVar4 = ab0Var.d;
                            if (!njVar4.i && njVar4.d != null && njVar4.e >= 0 && ua0Var.e(q1Var) && !oa0Var.x()) {
                                org.telegram.messenger.nj njVar5 = ab0Var.d;
                                oa0Var.a0(q1Var, njVar5.e, njVar5.f);
                                if (ua0Var.b0) {
                                    ua0Var.L = D(q1Var, ab0Var.d.e, false);
                                    ua0Var.M = D(q1Var, ab0Var.d.f, true);
                                    ua0Var.N = true;
                                    ua0Var.b0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }

    private final void F(s4.c1 c1Var, int i10) {
    }
}
