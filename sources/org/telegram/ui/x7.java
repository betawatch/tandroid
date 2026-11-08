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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x7 extends v4.g0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x7(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.q1 q1Var, int i7, boolean z9) {
        int C;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        org.telegram.messenger.gj gjVar;
        if (q1Var != null) {
            org.telegram.ui.Cells.x1 x1Var = q1Var.hb;
            org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.w2 != null) {
                    q1Var.S2(true);
                    org.telegram.messenger.kv kvVar = messageObject.w2;
                    ArrayList arrayList2 = kvVar.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) kvVar.o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.t9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                return ((org.telegram.ui.Cells.t9) arrayList2.get(size)).getY() + q1Var.t0 + (z9 ? a10.getLineBottom(lineForOffset) : a10.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.d1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (gjVar = q1Var.l3) == null) {
                        q1Var.S2(true);
                        int i10 = q1Var.t0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.z2;
                        C = q1Var.u1 ? org.telegram.messenger.k5.C(10.0f, q1Var.V1, i10) : i10;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        C = (int) q1Var.s3;
                        charSequence = messageObject.z;
                        arrayList = gjVar.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                            StaticLayout staticLayout = fjVar.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i12 = fjVar.n;
                            if (i7 > i12) {
                                if (i7 - i12 > charSequence3.length() - 1) {
                                    lineBottom = C + ((int) (fjVar.p(arrayList, x1Var) + fjVar.f + fjVar.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - fjVar.n);
                                    lineBottom = (z9 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + fjVar.p(arrayList, x1Var) + C + fjVar.f;
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

    @Override // v4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).e3.size();
            case 2:
                return ((org.telegram.ui.Components.q8) this.d).e3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.kj kjVar = ((org.telegram.ui.Components.ca0) this.d).r;
                if (kjVar == null) {
                    return 0;
                }
                return kjVar.f.size();
            default:
                return ((gm0) this.d).f.size();
        }
    }

    @Override // v4.g0
    public long c(int i7) {
        switch (this.c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i7 / 12)) * 100) + (h8Var.J - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                if (i7 >= ((org.telegram.ui.Components.q8) this.d).e3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.p8) r0.e3.get(i7)).a;
        }
    }

    @Override // v4.g0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7 >= ((org.telegram.ui.Components.q8) this.d).e3.size() ? 1 : 0;
            case 5:
                return 0;
            default:
                return super.d(i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        SparseArray sparseArray;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        int i13 = this.c;
        Object obj = this.d;
        switch (i13) {
            case 0:
                e8 e8Var = (e8) d1Var.a;
                h8 h8Var = (h8) obj;
                int i14 = h8Var.I - (i7 / 12);
                int i15 = h8Var.J - (i7 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (e8Var.b == i14) {
                    int i16 = e8Var.c;
                }
                SparseArray sparseArray2 = (SparseArray) h8Var.S.get((i14 * 100) + i15);
                h8 h8Var2 = e8Var.y;
                boolean z11 = (i14 == e8Var.b && i15 == e8Var.c) ? false : true;
                e8Var.b = i14;
                e8Var.c = i15;
                e8Var.n = sparseArray2;
                if (z11 && e8Var.r != null) {
                    for (int i17 = 0; i17 < e8Var.r.size(); i17++) {
                        ((ImageReceiver) e8Var.r.valueAt(i17)).R();
                        ((ImageReceiver) e8Var.r.valueAt(i17)).H0(null);
                    }
                    e8Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (e8Var.r == null) {
                        e8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i18);
                        if (e8Var.r.get(keyAt, null) == null && ((f8) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(null);
                            imageReceiver.H0(e8Var);
                            org.telegram.messenger.ij ijVar = ((f8) sparseArray2.get(keyAt)).a;
                            if (ijVar != null) {
                                boolean u22 = ijVar.u2();
                                if (org.telegram.messenger.ij.M4(ijVar.k)) {
                                    TLRPC.Document F0 = ijVar.F0();
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, null, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, org.telegram.messenger.qs.r5, false, null, false);
                                    if (w10 == w11) {
                                        w11 = null;
                                    }
                                    if (w10 != null) {
                                        if (ijVar.G1 != null) {
                                            imageReceiver.q0(org.telegram.messenger.hc.c(w11, F0), u22 ? "5_5_b" : "44_44", ijVar.G1, null, ijVar, 0);
                                        } else {
                                            imageReceiver.t0(org.telegram.messenger.hc.c(w11, F0), u22 ? "5_5_b" : "44_44", org.telegram.messenger.hc.c(w10, F0), "b", null, ijVar, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = ijVar.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !ijVar.n0.isEmpty()) {
                                        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(ijVar.n0, 50, false, null, false);
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(ijVar.n0, org.telegram.messenger.qs.r5, false, w12, false);
                                        if (!ijVar.x0) {
                                            i10 = ((org.telegram.ui.ActionBar.f2) h8Var2).currentAccount;
                                            if (!org.telegram.messenger.z5.q(i10).d(ijVar)) {
                                                BitmapDrawable bitmapDrawable = ijVar.G1;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.q0(null, null, bitmapDrawable, null, ijVar, 0);
                                                } else {
                                                    imageReceiver.t0(null, null, org.telegram.messenger.hc.f(w12, ijVar.l0), "b", null, ijVar, 0);
                                                }
                                            }
                                        }
                                        if (w13 == w12) {
                                            w12 = null;
                                        }
                                        if (ijVar.G1 != null) {
                                            imageReceiver.r0(org.telegram.messenger.hc.f(w13, ijVar.l0), u22 ? "5_5_b" : "44_44", null, null, ijVar.G1, w13 != null ? w13.size : 0L, null, ijVar, org.telegram.messenger.ij.S5(ijVar.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.r0(org.telegram.messenger.hc.f(w13, ijVar.l0), u22 ? "5_5_b" : "44_44", org.telegram.messenger.hc.f(w12, ijVar.l0), "b", null, w13 != null ? w13.size : 0L, null, ijVar, org.telegram.messenger.ij.S5(ijVar.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.J0(org.telegram.messenger.g0.L(22.0f));
                                e8Var.r.put(keyAt, imageReceiver);
                                i18++;
                                sparseArray2 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray2;
                        i18++;
                        sparseArray2 = sparseArray;
                    }
                }
                int i19 = i15 + 1;
                e8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                e8Var.e = (calendar.get(7) + 6) % 7;
                e8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = e8Var.d + e8Var.e;
                e8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                e8Var.a.l(org.telegram.messenger.id.e0(calendar.getTimeInMillis() / 1000, true), false);
                h8Var2.A0(e8Var, false);
                e8.a(e8Var, h8Var.P, h8Var.Q);
                e8.b(e8Var, 1.0f);
                h8Var.A0(e8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) d1Var.a;
                w80 w80Var = (w80) ((org.telegram.ui.Cells.t) obj).e3.get(i7);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = w80Var.b;
                int i22 = w80Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!w80Var.e || org.telegram.messenger.p10.o()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(org.telegram.messenger.id.M0(i22, null));
                } else {
                    SpannableString spannableString = new SpannableString(jg.g.l(i22, null, new StringBuilder("d ")));
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_mini_premiumlock, 0);
                    wpVar.n = 1;
                    wpVar.c(org.telegram.messenger.g0.L(13.0f));
                    spannableString.setSpan(wpVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(c8.ua.a(w80Var), false);
                int L = org.telegram.messenger.g0.L(18.0f);
                int i23 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(qVar, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, org.telegram.ui.ActionBar.k6.x0(null, i23, false), -16777216), null, org.telegram.ui.ActionBar.r6.N(i23), null);
                qVar.setForeground(w80Var.c);
                break;
            case 2:
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) obj;
                org.telegram.ui.Components.t8 t8Var = q8Var.j3;
                ArrayList arrayList = q8Var.e3;
                org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) d1Var.a;
                if (d1Var.f != 0) {
                    r8Var.d = true;
                    i11 = ((org.telegram.ui.ActionBar.f2) t8Var).currentAccount;
                    boolean z12 = !org.telegram.messenger.p10.i(i11).q();
                    if (r8Var.w != z12) {
                        r8Var.w = z12;
                        r8Var.invalidate();
                    }
                    r8Var.a = q8Var.i3;
                    z9 = q8Var.g3 == 1;
                    if (r8Var.c != z9) {
                        r8Var.c = z9;
                        r8Var.invalidate();
                        break;
                    }
                } else {
                    r8Var.d = false;
                    org.telegram.ui.Components.p8 p8Var = (org.telegram.ui.Components.p8) arrayList.get(i7);
                    if (p8Var.b) {
                        i12 = ((org.telegram.ui.ActionBar.f2) t8Var).currentAccount;
                        if (!org.telegram.messenger.p10.i(i12).q()) {
                            z10 = true;
                            if (r8Var.w != z10) {
                                r8Var.w = z10;
                                r8Var.invalidate();
                            }
                            r8Var.a = p8Var;
                            z9 = q8Var.g3 == ((org.telegram.ui.Components.p8) arrayList.get(i7)).a;
                            if (r8Var.c == z9) {
                                r8Var.c = z9;
                                r8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (r8Var.w != z10) {
                    }
                    r8Var.a = p8Var;
                    if (q8Var.g3 == ((org.telegram.ui.Components.p8) arrayList.get(i7)).a) {
                    }
                    if (r8Var.c == z9) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.ca0 ca0Var = (org.telegram.ui.Components.ca0) obj;
                bi.q1 q1Var = ca0Var.f;
                int i24 = ca0Var.a;
                org.telegram.messenger.kj kjVar = ca0Var.r;
                if (kjVar != null && d1Var.f == 0) {
                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) d1Var.a;
                    q1Var2.setInvalidateSpoilersParent(kjVar.i);
                    q1Var2.y3(q1Var.getMeasuredWidth(), q1Var.getMeasuredHeight());
                    int f12 = q1Var2.getMessageObject() != null ? q1Var2.getMessageObject().f1() : 0;
                    if (i24 == 2) {
                        ca0Var.c0.d.b((org.telegram.messenger.ij) ca0Var.r.f.get(i7));
                    }
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) ca0Var.r.f.get(i7);
                    org.telegram.messenger.kj kjVar2 = ca0Var.r;
                    q1Var2.w3(ijVar2, (org.telegram.messenger.dj) kjVar2.d.get(((org.telegram.messenger.ij) kjVar2.f.get(i7)).d1()), true, true, false, false);
                    if (i24 == 1) {
                        q1Var2.setDelegate(new w7.s(17, false));
                    }
                    if (ca0Var.r.f.size() > 1) {
                        q1Var2.j3(i24 == 1, false);
                        z9 = f12 == ((org.telegram.messenger.ij) ca0Var.r.f.get(i7)).f1();
                        org.telegram.messenger.kj kjVar3 = ca0Var.r;
                        boolean z13 = kjVar3.g.get(((org.telegram.messenger.ij) kjVar3.f.get(i7)).f1(), false);
                        q1Var2.l3(z13, z13, z9);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) d1Var.a;
                gm0 gm0Var = (gm0) obj;
                textView2.setText((CharSequence) gm0Var.f.get(i7));
                textView2.setTextColor(i7 == gm0Var.d ? gm0Var.E : gm0Var.D);
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.xi0(new e8((h8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, c8.ha.r(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                sVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.xi0(sVar);
            case 2:
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.d;
                return new org.telegram.ui.Components.xi0(new org.telegram.ui.Components.r8(q8Var.j3, q8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.xi0(((org.telegram.ui.Components.bm) this.d).w);
            case 4:
                return new org.telegram.ui.Components.xi0(new bi.ec(16, ((org.telegram.ui.Components.cn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.ca0 ca0Var = (org.telegram.ui.Components.ca0) this.d;
                org.telegram.ui.Components.ia0 ia0Var = ca0Var.c0;
                org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(this, context2, ia0Var.x, ca0Var.J, ia0Var.F);
                aa0Var.setClipChildren(false);
                aa0Var.setClipToPadding(false);
                aa0Var.setDelegate(new org.telegram.ui.Components.ba0(this));
                return new org.telegram.ui.Components.xi0(aa0Var);
            default:
                org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(viewGroup.getContext(), null);
                w70Var.setGravity(17);
                w70Var.setTypeface(org.telegram.messenger.g0.o());
                w70Var.setTextSize(1, 14.0f);
                w70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                w70Var.setEllipsize(TextUtils.TruncateAt.END);
                w70Var.setSingleLine();
                w70Var.setMaxLines(1);
                w70Var.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.ka.b(w70Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.xi0(w70Var);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        int i7;
        int i10;
        switch (this.c) {
            case 5:
                org.telegram.ui.Components.ca0 ca0Var = (org.telegram.ui.Components.ca0) this.d;
                org.telegram.ui.Components.w90 w90Var = ca0Var.e;
                org.telegram.ui.Components.ia0 ia0Var = ca0Var.c0;
                if (ca0Var.r != null && (i7 = ca0Var.a) != 1) {
                    View view = d1Var.a;
                    if (view instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
                        if (i7 != 0) {
                            q1Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            org.telegram.messenger.dj a10 = org.telegram.ui.Components.ca0.a(ca0Var, q1Var.getMessageObject());
                            q1Var.setDrawSelectionBackground(a10 == null);
                            q1Var.l3(true, a10 == null, false);
                            org.telegram.messenger.mj mjVar = ia0Var.d;
                            if (!mjVar.i && mjVar.d != null && ca0Var.e(q1Var)) {
                                org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
                                org.telegram.messenger.mj mjVar2 = ia0Var.d;
                                org.telegram.messenger.mj mjVar3 = ia0Var.d;
                                qm qmVar = mjVar3.d;
                                if (qmVar.m && messageObject != null && messageObject.w2 != null && ((i10 = mjVar3.e) < 0 || mjVar3.f <= i10)) {
                                    String str = qmVar.i;
                                    int[] f10 = str == null ? null : org.telegram.messenger.ov.f(messageObject, str, qmVar.o);
                                    if (f10 != null) {
                                        mjVar2.e = f10[0];
                                        mjVar2.f = f10[1];
                                    } else {
                                        mjVar2.e = 0;
                                        mjVar2.f = Math.min(org.telegram.messenger.qp.s1(ia0Var.x).o4, qm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.mj mjVar4 = ia0Var.d;
                            if (!mjVar4.i && mjVar4.d != null && mjVar4.e >= 0 && ca0Var.e(q1Var) && !w90Var.x()) {
                                org.telegram.messenger.mj mjVar5 = ia0Var.d;
                                w90Var.a0(q1Var, mjVar5.e, mjVar5.f);
                                if (ca0Var.b0) {
                                    ca0Var.L = D(q1Var, ia0Var.d.e, false);
                                    ca0Var.M = D(q1Var, ia0Var.d.f, true);
                                    ca0Var.N = true;
                                    ca0Var.b0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(v4.d1 d1Var, int i7) {
    }

    private final void F(v4.d1 d1Var, int i7) {
    }
}
