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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y7 extends u4.h0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(Object obj, int i3) {
        this.c = i3;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i3, boolean z10) {
        int C;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        org.telegram.messenger.xi xiVar;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.hb;
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.w2 != null) {
                    q1Var.R2(true);
                    org.telegram.messenger.cv cvVar = messageObject.w2;
                    ArrayList arrayList2 = cvVar.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) cvVar.o.get(size)).intValue();
                        if (i3 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.s9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i3 - intValue, a10.getText().length()));
                                return ((org.telegram.ui.Cells.s9) arrayList2.get(size)).getY() + q1Var.u0 + (z10 ? a10.getLineBottom(lineForOffset) : a10.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.d1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (xiVar = q1Var.l3) == null) {
                        q1Var.R2(true);
                        int i10 = q1Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.z2;
                        C = q1Var.u1 ? org.telegram.messenger.k5.C(10.0f, q1Var.V1, i10) : i10;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        C = (int) q1Var.s3;
                        charSequence = messageObject.z;
                        arrayList = xiVar.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) arrayList.get(i11);
                            StaticLayout staticLayout = wiVar.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i12 = wiVar.n;
                            if (i3 > i12) {
                                if (i3 - i12 > charSequence3.length() - 1) {
                                    lineBottom = C + ((int) (wiVar.p(arrayList, x1Var) + wiVar.f + wiVar.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i3 - wiVar.n);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + wiVar.p(arrayList, x1Var) + C + wiVar.f;
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

    @Override // u4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((i8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f3.size();
            case 2:
                return ((org.telegram.ui.Components.o8) this.d).f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.bj bjVar = ((org.telegram.ui.Components.x90) this.d).r;
                if (bjVar == null) {
                    return 0;
                }
                return bjVar.f.size();
            default:
                return ((bm0) this.d).f.size();
        }
    }

    @Override // u4.h0
    public long c(int i3) {
        switch (this.c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.J - (i3 / 12)) * 100) + (i8Var.K - (i3 % 12));
            case 1:
            default:
                return super.c(i3);
            case 2:
                if (i3 >= ((org.telegram.ui.Components.o8) this.d).f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.n8) r0.f3.get(i3)).a;
        }
    }

    @Override // u4.h0
    public int d(int i3) {
        switch (this.c) {
            case 2:
                return i3 >= ((org.telegram.ui.Components.o8) this.d).f3.size() ? 1 : 0;
            case 5:
                return 0;
            default:
                return super.d(i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, java.lang.Object, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
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
                f8 f8Var = (f8) d1Var.a;
                i8 i8Var = (i8) obj;
                int i14 = i8Var.J - (i3 / 12);
                int i15 = i8Var.K - (i3 % 12);
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
                            org.telegram.messenger.zi ziVar = ((g8) sparseArray2.get(keyAt)).a;
                            if (ziVar != null) {
                                boolean u22 = ziVar.u2();
                                if (org.telegram.messenger.zi.M4(ziVar.k)) {
                                    TLRPC.Document F0 = ziVar.F0();
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, r42, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, org.telegram.messenger.hs.r5, false, r42, false);
                                    if (w10 == w11) {
                                        w11 = r42;
                                    }
                                    if (w10 != null) {
                                        if (ziVar.G1 != null) {
                                            imageReceiver.q0(org.telegram.messenger.ac.c(w11, F0), u22 ? "5_5_b" : "44_44", ziVar.G1, null, ziVar, 0);
                                        } else {
                                            imageReceiver.t0(org.telegram.messenger.ac.c(w11, F0), u22 ? "5_5_b" : "44_44", org.telegram.messenger.ac.c(w10, F0), "b", null, ziVar, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = ziVar.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !ziVar.n0.isEmpty()) {
                                        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ziVar.n0, 50, false, r42, false);
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ziVar.n0, org.telegram.messenger.hs.r5, false, w12, false);
                                        if (!ziVar.x0) {
                                            i10 = ((org.telegram.ui.ActionBar.d2) i8Var2).currentAccount;
                                            if (!org.telegram.messenger.z5.q(i10).d(ziVar)) {
                                                BitmapDrawable bitmapDrawable = ziVar.G1;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.q0(null, null, bitmapDrawable, null, ziVar, 0);
                                                } else {
                                                    imageReceiver.t0(null, null, org.telegram.messenger.ac.f(w12, ziVar.l0), "b", null, ziVar, 0);
                                                }
                                            }
                                        }
                                        if (w13 == w12) {
                                            w12 = r42;
                                        }
                                        if (ziVar.G1 != null) {
                                            imageReceiver.r0(org.telegram.messenger.ac.f(w13, ziVar.l0), u22 ? "5_5_b" : "44_44", null, null, ziVar.G1, w13 != null ? w13.size : 0L, null, ziVar, org.telegram.messenger.zi.S5(ziVar.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.r0(org.telegram.messenger.ac.f(w13, ziVar.l0), u22 ? "5_5_b" : "44_44", org.telegram.messenger.ac.f(w12, ziVar.l0), "b", null, w13 != null ? w13.size : 0L, null, ziVar, org.telegram.messenger.zi.S5(ziVar.k) ? 2 : 1);
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
                f8Var.a.l(org.telegram.messenger.bd.e0(calendar.getTimeInMillis() / 1000, true), false);
                i8Var2.A0(f8Var, false);
                f8.a(f8Var, i8Var.Q, i8Var.R);
                f8.b(f8Var, 1.0f);
                i8Var.A0(f8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) d1Var.a;
                t80 t80Var = (t80) ((org.telegram.ui.Cells.t) obj).f3.get(i3);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = t80Var.b;
                int i22 = t80Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!t80Var.e || org.telegram.messenger.h10.o()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(org.telegram.messenger.bd.M0(i22, null));
                } else {
                    SpannableString spannableString = new SpannableString(k2.p1.k(i22, null, new StringBuilder("d ")));
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_premiumlock, 0);
                    wpVar.n = 1;
                    wpVar.c(org.telegram.messenger.g0.L(13.0f));
                    spannableString.setSpan(wpVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(b8.uf.a(t80Var), false);
                int L = org.telegram.messenger.g0.L(18.0f);
                int i23 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(qVar, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, org.telegram.ui.ActionBar.k6.x0(null, i23, false), -16777216), null, org.telegram.ui.ActionBar.r6.N(i23), null);
                qVar.setForeground(t80Var.c);
                break;
            case 2:
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) obj;
                org.telegram.ui.Components.r8 r8Var = o8Var.k3;
                ArrayList arrayList = o8Var.f3;
                org.telegram.ui.Components.p8 p8Var = (org.telegram.ui.Components.p8) d1Var.a;
                if (d1Var.f != 0) {
                    p8Var.d = true;
                    i11 = ((org.telegram.ui.ActionBar.d2) r8Var).currentAccount;
                    boolean z13 = !org.telegram.messenger.h10.i(i11).q();
                    if (p8Var.w != z13) {
                        p8Var.w = z13;
                        p8Var.invalidate();
                    }
                    p8Var.a = o8Var.j3;
                    z10 = o8Var.h3 == 1;
                    if (p8Var.c != z10) {
                        p8Var.c = z10;
                        p8Var.invalidate();
                        break;
                    }
                } else {
                    p8Var.d = false;
                    org.telegram.ui.Components.n8 n8Var = (org.telegram.ui.Components.n8) arrayList.get(i3);
                    if (n8Var.b) {
                        i12 = ((org.telegram.ui.ActionBar.d2) r8Var).currentAccount;
                        if (!org.telegram.messenger.h10.i(i12).q()) {
                            z11 = true;
                            if (p8Var.w != z11) {
                                p8Var.w = z11;
                                p8Var.invalidate();
                            }
                            p8Var.a = n8Var;
                            z10 = o8Var.h3 == ((org.telegram.ui.Components.n8) arrayList.get(i3)).a;
                            if (p8Var.c == z10) {
                                p8Var.c = z10;
                                p8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (p8Var.w != z11) {
                    }
                    p8Var.a = n8Var;
                    if (o8Var.h3 == ((org.telegram.ui.Components.n8) arrayList.get(i3)).a) {
                    }
                    if (p8Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) obj;
                ci.j1 j1Var = x90Var.f;
                int i24 = x90Var.a;
                org.telegram.messenger.bj bjVar = x90Var.r;
                if (bjVar != null && d1Var.f == 0) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) d1Var.a;
                    q1Var.setInvalidateSpoilersParent(bjVar.i);
                    q1Var.w3(j1Var.getMeasuredWidth(), j1Var.getMeasuredHeight());
                    int f12 = q1Var.getMessageObject() != null ? q1Var.getMessageObject().f1() : 0;
                    if (i24 == 2) {
                        x90Var.d0.d.b((org.telegram.messenger.zi) x90Var.r.f.get(i3));
                    }
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) x90Var.r.f.get(i3);
                    org.telegram.messenger.bj bjVar2 = x90Var.r;
                    q1Var.u3(ziVar2, (org.telegram.messenger.ui) bjVar2.d.get(((org.telegram.messenger.zi) bjVar2.f.get(i3)).d1()), true, true, false, false);
                    if (i24 == 1) {
                        q1Var.setDelegate(new kb.a(18));
                    }
                    if (x90Var.r.f.size() > 1) {
                        q1Var.h3(i24 == 1, false);
                        boolean z14 = f12 == ((org.telegram.messenger.zi) x90Var.r.f.get(i3)).f1();
                        org.telegram.messenger.bj bjVar3 = x90Var.r;
                        boolean z15 = bjVar3.g.get(((org.telegram.messenger.zi) bjVar3.f.get(i3)).f1(), false);
                        q1Var.j3(z15, z15, z14);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) d1Var.a;
                bm0 bm0Var = (bm0) obj;
                textView2.setText((CharSequence) bm0Var.f.get(i3));
                textView2.setTextColor(i3 == bm0Var.d ? bm0Var.F : bm0Var.E);
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.bj0(new f8((i8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, b8.mf.r(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                sVar.addView(textView, b8.mf.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.bj0(sVar);
            case 2:
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.d;
                return new org.telegram.ui.Components.bj0(new org.telegram.ui.Components.p8(o8Var.k3, o8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.bj0(((org.telegram.ui.Components.am) this.d).w);
            case 4:
                return new org.telegram.ui.Components.bj0(new ai.x2(17, ((org.telegram.ui.Components.bn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) this.d;
                org.telegram.ui.Components.da0 da0Var = x90Var.d0;
                org.telegram.ui.Components.v90 v90Var = new org.telegram.ui.Components.v90(this, context2, da0Var.x, x90Var.K, da0Var.G);
                v90Var.setClipChildren(false);
                v90Var.setClipToPadding(false);
                v90Var.setDelegate(new org.telegram.ui.Components.w90(this));
                return new org.telegram.ui.Components.bj0(v90Var);
            default:
                org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(viewGroup.getContext(), null);
                s70Var.setGravity(17);
                s70Var.setTypeface(org.telegram.messenger.g0.o());
                s70Var.setTextSize(1, 14.0f);
                s70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                s70Var.setEllipsize(TextUtils.TruncateAt.END);
                s70Var.setSingleLine();
                s70Var.setMaxLines(1);
                s70Var.setLayoutParams(new u4.p0(-2, org.telegram.messenger.g0.L(28.0f)));
                b8.pf.b(s70Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.bj0(s70Var);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        int i3;
        int i10;
        switch (this.c) {
            case 5:
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) this.d;
                org.telegram.ui.Components.r90 r90Var = x90Var.e;
                org.telegram.ui.Components.da0 da0Var = x90Var.d0;
                if (x90Var.r != null && (i3 = x90Var.a) != 1) {
                    View view = d1Var.a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i3 != 0) {
                            q1Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            org.telegram.messenger.ui a10 = org.telegram.ui.Components.x90.a(x90Var, q1Var.getMessageObject());
                            q1Var.setDrawSelectionBackground(a10 == null);
                            q1Var.j3(true, a10 == null, false);
                            org.telegram.messenger.dj djVar = da0Var.d;
                            if (!djVar.i && djVar.d != null && x90Var.e(q1Var)) {
                                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.dj djVar2 = da0Var.d;
                                org.telegram.messenger.dj djVar3 = da0Var.d;
                                mm mmVar = djVar3.d;
                                if (mmVar.m && messageObject != null && messageObject.w2 != null && ((i10 = djVar3.e) < 0 || djVar3.f <= i10)) {
                                    String str = mmVar.i;
                                    int[] f10 = str == null ? null : org.telegram.messenger.gv.f(messageObject, str, mmVar.o);
                                    if (f10 != null) {
                                        djVar2.e = f10[0];
                                        djVar2.f = f10[1];
                                    } else {
                                        djVar2.e = 0;
                                        djVar2.f = Math.min(org.telegram.messenger.hp.s1(da0Var.x).o4, mm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.dj djVar4 = da0Var.d;
                            if (!djVar4.i && djVar4.d != null && djVar4.e >= 0 && x90Var.e(q1Var) && !r90Var.x()) {
                                org.telegram.messenger.dj djVar5 = da0Var.d;
                                r90Var.a0(q1Var, djVar5.e, djVar5.f);
                                if (x90Var.c0) {
                                    x90Var.M = D(q1Var, da0Var.d.e, false);
                                    x90Var.N = D(q1Var, da0Var.d.f, true);
                                    x90Var.O = true;
                                    x90Var.c0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(u4.d1 d1Var, int i3) {
    }

    private final void F(u4.d1 d1Var, int i3) {
    }
}
