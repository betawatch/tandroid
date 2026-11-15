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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y7 extends v4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z10) {
        int C;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        org.telegram.messenger.ej ejVar;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.ib;
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    q1Var.T2(true);
                    org.telegram.messenger.iv ivVar = messageObject.y2;
                    ArrayList arrayList2 = ivVar.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) ivVar.o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.s9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                return ((org.telegram.ui.Cells.s9) arrayList2.get(size)).getY() + q1Var.u0 + (z10 ? a10.getLineBottom(lineForOffset) : a10.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (ejVar = q1Var.m3) == null) {
                        q1Var.T2(true);
                        int i10 = q1Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        C = q1Var.v1 ? org.telegram.messenger.k5.C(10.0f, q1Var.W1, i10) : i10;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        C = (int) q1Var.t3;
                        charSequence = messageObject.z;
                        arrayList = ejVar.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) arrayList.get(i11);
                            StaticLayout staticLayout = djVar.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i12 = djVar.n;
                            if (i7 > i12) {
                                if (i7 - i12 > charSequence3.length() - 1) {
                                    lineBottom = C + ((int) (djVar.p(arrayList, x1Var) + djVar.f + djVar.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - djVar.n);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + djVar.p(arrayList, x1Var) + C + djVar.f;
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

    @Override // v4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f3.size();
            case 2:
                return ((org.telegram.ui.Components.n8) this.d).f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.ij ijVar = ((org.telegram.ui.Components.da0) this.d).r;
                if (ijVar == null) {
                    return 0;
                }
                return ijVar.f.size();
            default:
                return ((hm0) this.d).f.size();
        }
    }

    @Override // v4.h0
    public long c(int i7) {
        switch (this.c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i7 / 12)) * 100) + (i8Var.K - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                if (i7 >= ((org.telegram.ui.Components.n8) this.d).f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.m8) r0.f3.get(i7)).a;
        }
    }

    @Override // v4.h0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7 >= ((org.telegram.ui.Components.n8) this.d).f3.size() ? 1 : 0;
            case 5:
                return 0;
            default:
                return super.d(i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, java.lang.Object, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        SparseArray sparseArray;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13 = this.c;
        ?? r42 = 0;
        Object obj = this.d;
        switch (i13) {
            case 0:
                f8 f8Var = (f8) e1Var.a;
                i8 i8Var = (i8) obj;
                int i14 = i8Var.J - (i7 / 12);
                int i15 = i8Var.K - (i7 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (f8Var.b == i14) {
                    int i16 = f8Var.c;
                }
                SparseArray sparseArray2 = (SparseArray) i8Var.T.get((i14 * 100) + i15);
                i8 i8Var2 = f8Var.y;
                boolean z12 = (i14 == f8Var.b && i15 == f8Var.c) ? false : true;
                f8Var.b = i14;
                f8Var.c = i15;
                f8Var.n = sparseArray2;
                if (z12 && f8Var.r != null) {
                    for (int i17 = 0; i17 < f8Var.r.size(); i17++) {
                        ((ImageReceiver) f8Var.r.valueAt(i17)).R();
                        ((ImageReceiver) f8Var.r.valueAt(i17)).H0(null);
                    }
                    f8Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (f8Var.r == null) {
                        f8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i18);
                        if (f8Var.r.get(keyAt, r42) == null && ((g8) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(r42);
                            imageReceiver.H0(f8Var);
                            org.telegram.messenger.gj gjVar = ((g8) sparseArray2.get(keyAt)).a;
                            if (gjVar != null) {
                                boolean t22 = gjVar.t2();
                                if (org.telegram.messenger.gj.L4(gjVar.k)) {
                                    TLRPC.Document F0 = gjVar.F0();
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, r42, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, org.telegram.messenger.ns.r5, false, r42, false);
                                    if (w10 == w11) {
                                        w11 = r42;
                                    }
                                    if (w10 != null) {
                                        if (gjVar.I1 != null) {
                                            imageReceiver.q0(org.telegram.messenger.gc.c(w11, F0), t22 ? "5_5_b" : "44_44", gjVar.I1, null, gjVar, 0);
                                        } else {
                                            imageReceiver.t0(org.telegram.messenger.gc.c(w11, F0), t22 ? "5_5_b" : "44_44", org.telegram.messenger.gc.c(w10, F0), "b", null, gjVar, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = gjVar.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !gjVar.p0.isEmpty()) {
                                        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(gjVar.p0, 50, false, r42, false);
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(gjVar.p0, org.telegram.messenger.ns.r5, false, w12, false);
                                        if (!gjVar.z0) {
                                            i10 = ((org.telegram.ui.ActionBar.e2) i8Var2).currentAccount;
                                            if (!org.telegram.messenger.z5.q(i10).d(gjVar)) {
                                                BitmapDrawable bitmapDrawable = gjVar.I1;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.q0(null, null, bitmapDrawable, null, gjVar, 0);
                                                } else {
                                                    imageReceiver.t0(null, null, org.telegram.messenger.gc.f(w12, gjVar.n0), "b", null, gjVar, 0);
                                                }
                                            }
                                        }
                                        if (w13 == w12) {
                                            w12 = r42;
                                        }
                                        if (gjVar.I1 != null) {
                                            imageReceiver.r0(org.telegram.messenger.gc.f(w13, gjVar.n0), t22 ? "5_5_b" : "44_44", null, null, gjVar.I1, w13 != null ? w13.size : 0L, null, gjVar, org.telegram.messenger.gj.R5(gjVar.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.r0(org.telegram.messenger.gc.f(w13, gjVar.n0), t22 ? "5_5_b" : "44_44", org.telegram.messenger.gc.f(w12, gjVar.n0), "b", null, w13 != null ? w13.size : 0L, null, gjVar, org.telegram.messenger.gj.R5(gjVar.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.J0(org.telegram.messenger.g0.L(22.0f));
                                f8Var.r.put(keyAt, imageReceiver);
                                i18++;
                                sparseArray2 = sparseArray;
                                r42 = 0;
                            }
                        }
                        sparseArray = sparseArray2;
                        i18++;
                        sparseArray2 = sparseArray;
                        r42 = 0;
                    }
                }
                int i19 = i15 + 1;
                f8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                f8Var.e = (calendar.get(7) + 6) % 7;
                f8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = f8Var.d + f8Var.e;
                f8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                f8Var.a.l(org.telegram.messenger.hd.e0(calendar.getTimeInMillis() / 1000, true), false);
                i8Var2.A0(f8Var, false);
                f8.a(f8Var, i8Var.Q, i8Var.R);
                f8.b(f8Var, 1.0f);
                i8Var.A0(f8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) e1Var.a;
                w80 w80Var = (w80) ((org.telegram.ui.Cells.t) obj).f3.get(i7);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = w80Var.b;
                int i22 = w80Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!w80Var.e || org.telegram.messenger.m10.o()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(org.telegram.messenger.hd.M0(i22, null));
                } else {
                    SpannableString spannableString = new SpannableString(i5.c.k(i22, null, new StringBuilder("d ")));
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_premiumlock, 0);
                    eqVar.n = 1;
                    eqVar.c(org.telegram.messenger.g0.L(13.0f));
                    spannableString.setSpan(eqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(c8.wa.a(w80Var), false);
                int L = org.telegram.messenger.g0.L(18.0f);
                int i23 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.q6.Q(qVar, org.telegram.ui.ActionBar.j6.k0(L, L, L, L, 0, org.telegram.ui.ActionBar.j6.x0(null, i23, false), -16777216), null, org.telegram.ui.ActionBar.q6.M(i23), null);
                qVar.setForeground(w80Var.c);
                break;
            case 2:
                org.telegram.ui.Components.n8 n8Var = (org.telegram.ui.Components.n8) obj;
                org.telegram.ui.Components.q8 q8Var = n8Var.k3;
                ArrayList arrayList = n8Var.f3;
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) e1Var.a;
                if (e1Var.f != 0) {
                    o8Var.d = true;
                    i11 = ((org.telegram.ui.ActionBar.e2) q8Var).currentAccount;
                    boolean z13 = !org.telegram.messenger.m10.i(i11).q();
                    if (o8Var.w != z13) {
                        o8Var.w = z13;
                        o8Var.invalidate();
                    }
                    o8Var.a = n8Var.j3;
                    z10 = n8Var.h3 == 1;
                    if (o8Var.c != z10) {
                        o8Var.c = z10;
                        o8Var.invalidate();
                        break;
                    }
                } else {
                    o8Var.d = false;
                    org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) arrayList.get(i7);
                    if (m8Var.b) {
                        i12 = ((org.telegram.ui.ActionBar.e2) q8Var).currentAccount;
                        if (!org.telegram.messenger.m10.i(i12).q()) {
                            z11 = true;
                            if (o8Var.w != z11) {
                                o8Var.w = z11;
                                o8Var.invalidate();
                            }
                            o8Var.a = m8Var;
                            z10 = n8Var.h3 == ((org.telegram.ui.Components.m8) arrayList.get(i7)).a;
                            if (o8Var.c == z10) {
                                o8Var.c = z10;
                                o8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (o8Var.w != z11) {
                    }
                    o8Var.a = m8Var;
                    if (n8Var.h3 == ((org.telegram.ui.Components.m8) arrayList.get(i7)).a) {
                    }
                    if (o8Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) obj;
                di.c1 c1Var = da0Var.f;
                int i24 = da0Var.a;
                org.telegram.messenger.ij ijVar = da0Var.r;
                if (ijVar != null && e1Var.f == 0) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) e1Var.a;
                    q1Var.setInvalidateSpoilersParent(ijVar.i);
                    q1Var.z3(c1Var.getMeasuredWidth(), c1Var.getMeasuredHeight());
                    int e12 = q1Var.getMessageObject() != null ? q1Var.getMessageObject().e1() : 0;
                    if (i24 == 2) {
                        da0Var.d0.d.b((org.telegram.messenger.gj) da0Var.r.f.get(i7));
                    }
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) da0Var.r.f.get(i7);
                    org.telegram.messenger.ij ijVar2 = da0Var.r;
                    q1Var.x3(gjVar2, (org.telegram.messenger.bj) ijVar2.d.get(((org.telegram.messenger.gj) ijVar2.f.get(i7)).c1()), true, true, false, false);
                    if (i24 == 1) {
                        q1Var.setDelegate(new qb.a(18));
                    }
                    if (da0Var.r.f.size() > 1) {
                        q1Var.k3(i24 == 1, false);
                        boolean z14 = e12 == ((org.telegram.messenger.gj) da0Var.r.f.get(i7)).e1();
                        org.telegram.messenger.ij ijVar3 = da0Var.r;
                        boolean z15 = ijVar3.g.get(((org.telegram.messenger.gj) ijVar3.f.get(i7)).e1(), false);
                        q1Var.m3(z15, z15, z14);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) e1Var.a;
                hm0 hm0Var = (hm0) obj;
                textView2.setText((CharSequence) hm0Var.f.get(i7));
                textView2.setTextColor(i7 == hm0Var.d ? hm0Var.F : hm0Var.E);
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.cj0(new f8((i8) this.d, viewGroup.getContext()));
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
                qVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                sVar.addView(qVar, c8.ja.r(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
                sVar.addView(textView, c8.ja.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.cj0(sVar);
            case 2:
                org.telegram.ui.Components.n8 n8Var = (org.telegram.ui.Components.n8) this.d;
                return new org.telegram.ui.Components.cj0(new org.telegram.ui.Components.o8(n8Var.k3, n8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.cj0(((org.telegram.ui.Components.im) this.d).w);
            case 4:
                return new org.telegram.ui.Components.cj0(new bi.o2(17, ((org.telegram.ui.Components.kn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) this.d;
                org.telegram.ui.Components.ja0 ja0Var = da0Var.d0;
                org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(this, context2, ja0Var.x, da0Var.K, ja0Var.G);
                ba0Var.setClipChildren(false);
                ba0Var.setClipToPadding(false);
                ba0Var.setDelegate(new org.telegram.ui.Components.ca0(this));
                return new org.telegram.ui.Components.cj0(ba0Var);
            default:
                org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(viewGroup.getContext(), null);
                z70Var.setGravity(17);
                z70Var.setTypeface(org.telegram.messenger.g0.o());
                z70Var.setTextSize(1, 14.0f);
                z70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                z70Var.setEllipsize(TextUtils.TruncateAt.END);
                z70Var.setSingleLine();
                z70Var.setMaxLines(1);
                z70Var.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.na.b(z70Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.cj0(z70Var);
        }
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
        int i7;
        int i10;
        switch (this.c) {
            case 5:
                org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) this.d;
                org.telegram.ui.Components.x90 x90Var = da0Var.e;
                org.telegram.ui.Components.ja0 ja0Var = da0Var.d0;
                if (da0Var.r != null && (i7 = da0Var.a) != 1) {
                    View view = e1Var.a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i7 != 0) {
                            q1Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            org.telegram.messenger.bj a10 = org.telegram.ui.Components.da0.a(da0Var, q1Var.getMessageObject());
                            q1Var.setDrawSelectionBackground(a10 == null);
                            q1Var.m3(true, a10 == null, false);
                            org.telegram.messenger.kj kjVar = ja0Var.d;
                            if (!kjVar.i && kjVar.d != null && da0Var.e(q1Var)) {
                                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.kj kjVar2 = ja0Var.d;
                                org.telegram.messenger.kj kjVar3 = ja0Var.d;
                                qm qmVar = kjVar3.d;
                                if (qmVar.m && messageObject != null && messageObject.y2 != null && ((i10 = kjVar3.e) < 0 || kjVar3.f <= i10)) {
                                    String str = qmVar.i;
                                    int[] f10 = str == null ? null : org.telegram.messenger.mv.f(messageObject, str, qmVar.o);
                                    if (f10 != null) {
                                        kjVar2.e = f10[0];
                                        kjVar2.f = f10[1];
                                    } else {
                                        kjVar2.e = 0;
                                        kjVar2.f = Math.min(org.telegram.messenger.np.s1(ja0Var.x).p4, qm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.kj kjVar4 = ja0Var.d;
                            if (!kjVar4.i && kjVar4.d != null && kjVar4.e >= 0 && da0Var.e(q1Var) && !x90Var.x()) {
                                org.telegram.messenger.kj kjVar5 = ja0Var.d;
                                x90Var.a0(q1Var, kjVar5.e, kjVar5.f);
                                if (da0Var.c0) {
                                    da0Var.M = D(q1Var, ja0Var.d.e, false);
                                    da0Var.N = D(q1Var, ja0Var.d.f, true);
                                    da0Var.O = true;
                                    da0Var.c0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(v4.e1 e1Var, int i7) {
    }

    private final void F(v4.e1 e1Var, int i7) {
    }
}
