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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class y7 extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.r1 r1Var, int i7, boolean z10) {
        int C;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        org.telegram.messenger.ej ejVar;
        if (r1Var != null) {
            org.telegram.ui.Cells.y1 y1Var = r1Var.ib;
            org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    r1Var.V2(true);
                    org.telegram.messenger.fv fvVar = messageObject.y2;
                    ArrayList arrayList2 = fvVar.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) fvVar.o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.u9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                return ((org.telegram.ui.Cells.u9) arrayList2.get(size)).getY() + r1Var.u0 + (z10 ? a10.getLineBottom(lineForOffset) : a10.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (ejVar = r1Var.m3) == null) {
                        r1Var.V2(true);
                        int i10 = r1Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        C = r1Var.v1 ? org.telegram.messenger.f3.C(10.0f, r1Var.W1, i10) : i10;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        C = (int) r1Var.t3;
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
                                    lineBottom = C + ((int) (djVar.p(arrayList, y1Var) + djVar.f + djVar.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - djVar.n);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + djVar.p(arrayList, y1Var) + C + djVar.f;
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

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f3.size();
            case 2:
                return ((org.telegram.ui.Components.v8) this.d).f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.ij ijVar = ((org.telegram.ui.Components.qa0) this.d).r;
                if (ijVar == null) {
                    return 0;
                }
                return ijVar.f.size();
            default:
                return ((km0) this.d).f.size();
        }
    }

    @Override // v4.i0
    public long c(int i7) {
        switch (this.c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i7 / 12)) * 100) + (i8Var.K - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                if (i7 >= ((org.telegram.ui.Components.v8) this.d).f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.u8) r0.f3.get(i7)).a;
        }
    }

    @Override // v4.i0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7 >= ((org.telegram.ui.Components.v8) this.d).f3.size() ? 1 : 0;
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
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
                f8 f8Var = (f8) f1Var.a;
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
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, org.telegram.messenger.ls.r5, false, r42, false);
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
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(gjVar.p0, org.telegram.messenger.ls.r5, false, w12, false);
                                        if (!gjVar.z0) {
                                            i10 = ((org.telegram.ui.ActionBar.g2) i8Var2).currentAccount;
                                            if (!org.telegram.messenger.a6.q(i10).d(gjVar)) {
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
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) f1Var.a;
                z80 z80Var = (z80) ((org.telegram.ui.Cells.t) obj).f3.get(i7);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = z80Var.b;
                int i22 = z80Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!z80Var.e || org.telegram.messenger.k10.o()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(org.telegram.messenger.hd.N0(i22, null));
                } else {
                    SpannableString spannableString = new SpannableString(i5.c.k(i22, null, new StringBuilder("d ")));
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.msg_mini_premiumlock, 0);
                    nqVar.n = 1;
                    nqVar.c(org.telegram.messenger.g0.L(13.0f));
                    spannableString.setSpan(nqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(c8.ya.a(z80Var), false);
                int L = org.telegram.messenger.g0.L(18.0f);
                int i23 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.ActionBar.t6.Q(qVar, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, org.telegram.ui.ActionBar.m6.x0(null, i23, false), -16777216), null, org.telegram.ui.ActionBar.t6.M(i23), null);
                qVar.setForeground(z80Var.c);
                break;
            case 2:
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) obj;
                org.telegram.ui.Components.y8 y8Var = v8Var.k3;
                ArrayList arrayList = v8Var.f3;
                org.telegram.ui.Components.w8 w8Var = (org.telegram.ui.Components.w8) f1Var.a;
                if (f1Var.f != 0) {
                    w8Var.d = true;
                    i11 = ((org.telegram.ui.ActionBar.g2) y8Var).currentAccount;
                    boolean z13 = !org.telegram.messenger.k10.i(i11).q();
                    if (w8Var.w != z13) {
                        w8Var.w = z13;
                        w8Var.invalidate();
                    }
                    w8Var.a = v8Var.j3;
                    z10 = v8Var.h3 == 1;
                    if (w8Var.c != z10) {
                        w8Var.c = z10;
                        w8Var.invalidate();
                        break;
                    }
                } else {
                    w8Var.d = false;
                    org.telegram.ui.Components.u8 u8Var = (org.telegram.ui.Components.u8) arrayList.get(i7);
                    if (u8Var.b) {
                        i12 = ((org.telegram.ui.ActionBar.g2) y8Var).currentAccount;
                        if (!org.telegram.messenger.k10.i(i12).q()) {
                            z11 = true;
                            if (w8Var.w != z11) {
                                w8Var.w = z11;
                                w8Var.invalidate();
                            }
                            w8Var.a = u8Var;
                            z10 = v8Var.h3 == ((org.telegram.ui.Components.u8) arrayList.get(i7)).a;
                            if (w8Var.c == z10) {
                                w8Var.c = z10;
                                w8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (w8Var.w != z11) {
                    }
                    w8Var.a = u8Var;
                    if (v8Var.h3 == ((org.telegram.ui.Components.u8) arrayList.get(i7)).a) {
                    }
                    if (w8Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) obj;
                di.b1 b1Var = qa0Var.f;
                int i24 = qa0Var.a;
                org.telegram.messenger.ij ijVar = qa0Var.r;
                if (ijVar != null && f1Var.f == 0) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.a;
                    r1Var.setInvalidateSpoilersParent(ijVar.i);
                    r1Var.A3(b1Var.getMeasuredWidth(), b1Var.getMeasuredHeight());
                    int e12 = r1Var.getMessageObject() != null ? r1Var.getMessageObject().e1() : 0;
                    if (i24 == 2) {
                        qa0Var.d0.d.b((org.telegram.messenger.gj) qa0Var.r.f.get(i7));
                    }
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) qa0Var.r.f.get(i7);
                    org.telegram.messenger.ij ijVar2 = qa0Var.r;
                    r1Var.y3(gjVar2, (org.telegram.messenger.bj) ijVar2.d.get(((org.telegram.messenger.gj) ijVar2.f.get(i7)).c1()), true, true, false, false);
                    if (i24 == 1) {
                        r1Var.setDelegate(new qb.a(18));
                    }
                    if (qa0Var.r.f.size() > 1) {
                        r1Var.l3(i24 == 1, false);
                        boolean z14 = e12 == ((org.telegram.messenger.gj) qa0Var.r.f.get(i7)).e1();
                        org.telegram.messenger.ij ijVar3 = qa0Var.r;
                        boolean z15 = ijVar3.g.get(((org.telegram.messenger.gj) ijVar3.f.get(i7)).e1(), false);
                        r1Var.n3(z15, z15, z14);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) f1Var.a;
                km0 km0Var = (km0) obj;
                textView2.setText((CharSequence) km0Var.f.get(i7));
                textView2.setTextColor(i7 == km0Var.d ? km0Var.F : km0Var.E);
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.mj0(new f8((i8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, c8.ma.r(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                sVar.addView(textView, c8.ma.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.mj0(sVar);
            case 2:
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) this.d;
                return new org.telegram.ui.Components.mj0(new org.telegram.ui.Components.w8(v8Var.k3, v8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.mj0(((org.telegram.ui.Components.rm) this.d).w);
            case 4:
                return new org.telegram.ui.Components.mj0(new bi.m3(17, ((org.telegram.ui.Components.un) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) this.d;
                org.telegram.ui.Components.wa0 wa0Var = qa0Var.d0;
                org.telegram.ui.Components.oa0 oa0Var = new org.telegram.ui.Components.oa0(this, context2, wa0Var.x, qa0Var.K, wa0Var.G);
                oa0Var.setClipChildren(false);
                oa0Var.setClipToPadding(false);
                oa0Var.setDelegate(new org.telegram.ui.Components.pa0(this));
                return new org.telegram.ui.Components.mj0(oa0Var);
            default:
                org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(viewGroup.getContext(), null);
                m80Var.setGravity(17);
                m80Var.setTypeface(org.telegram.messenger.g0.o());
                m80Var.setTextSize(1, 14.0f);
                m80Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                m80Var.setEllipsize(TextUtils.TruncateAt.END);
                m80Var.setSingleLine();
                m80Var.setMaxLines(1);
                m80Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.ra.b(m80Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.mj0(m80Var);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        int i7;
        int i10;
        switch (this.c) {
            case 5:
                org.telegram.ui.Components.qa0 qa0Var = (org.telegram.ui.Components.qa0) this.d;
                org.telegram.ui.Components.ka0 ka0Var = qa0Var.e;
                org.telegram.ui.Components.wa0 wa0Var = qa0Var.d0;
                if (qa0Var.r != null && (i7 = qa0Var.a) != 1) {
                    View view = f1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                        if (i7 != 0) {
                            r1Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            org.telegram.messenger.bj a10 = org.telegram.ui.Components.qa0.a(qa0Var, r1Var.getMessageObject());
                            r1Var.setDrawSelectionBackground(a10 == null);
                            r1Var.n3(true, a10 == null, false);
                            org.telegram.messenger.kj kjVar = wa0Var.d;
                            if (!kjVar.i && kjVar.d != null && qa0Var.e(r1Var)) {
                                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                                org.telegram.messenger.kj kjVar2 = wa0Var.d;
                                org.telegram.messenger.kj kjVar3 = wa0Var.d;
                                rm rmVar = kjVar3.d;
                                if (rmVar.m && messageObject != null && messageObject.y2 != null && ((i10 = kjVar3.e) < 0 || kjVar3.f <= i10)) {
                                    String str = rmVar.i;
                                    int[] f10 = str == null ? null : org.telegram.messenger.jv.f(messageObject, str, rmVar.o);
                                    if (f10 != null) {
                                        kjVar2.e = f10[0];
                                        kjVar2.f = f10[1];
                                    } else {
                                        kjVar2.e = 0;
                                        kjVar2.f = Math.min(org.telegram.messenger.np.u1(wa0Var.x).r4, rm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.kj kjVar4 = wa0Var.d;
                            if (!kjVar4.i && kjVar4.d != null && kjVar4.e >= 0 && qa0Var.e(r1Var) && !ka0Var.x()) {
                                org.telegram.messenger.kj kjVar5 = wa0Var.d;
                                ka0Var.a0(r1Var, kjVar5.e, kjVar5.f);
                                if (qa0Var.c0) {
                                    qa0Var.M = D(r1Var, wa0Var.d.e, false);
                                    qa0Var.N = D(r1Var, wa0Var.d.f, true);
                                    qa0Var.O = true;
                                    qa0Var.c0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(v4.f1 f1Var, int i7) {
    }

    private final void F(v4.f1 f1Var, int i7) {
    }
}
