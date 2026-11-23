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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z7 extends v4.i0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z7(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    public static int D(org.telegram.ui.Cells.r1 r1Var, int i7, boolean z10) {
        int C;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        org.telegram.messenger.dj djVar;
        if (r1Var != null) {
            org.telegram.ui.Cells.y1 y1Var = r1Var.ib;
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    r1Var.V2(true);
                    org.telegram.messenger.ev evVar = messageObject.y2;
                    ArrayList arrayList2 = evVar.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) evVar.o.get(size)).intValue();
                        if (i7 < intValue) {
                            size--;
                        } else {
                            Layout a10 = ((org.telegram.ui.Cells.t9) arrayList2.get(size)).a();
                            if (a10 != null) {
                                int lineForOffset = a10.getLineForOffset(Math.min(i7 - intValue, a10.getText().length()));
                                return ((org.telegram.ui.Cells.t9) arrayList2.get(size)).getY() + r1Var.u0 + (z10 ? a10.getLineBottom(lineForOffset) : a10.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (djVar = r1Var.m3) == null) {
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
                        arrayList = djVar.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) arrayList.get(i11);
                            StaticLayout staticLayout = cjVar.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i12 = cjVar.n;
                            if (i7 > i12) {
                                if (i7 - i12 > charSequence3.length() - 1) {
                                    lineBottom = C + ((int) (cjVar.p(arrayList, y1Var) + cjVar.f + cjVar.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i7 - cjVar.n);
                                    lineBottom = (z10 ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + cjVar.p(arrayList, y1Var) + C + cjVar.f;
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
                return ((j8) this.d).L;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f3.size();
            case 2:
                return ((org.telegram.ui.Components.u8) this.d).f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            case 5:
                org.telegram.messenger.hj hjVar = ((org.telegram.ui.Components.na0) this.d).r;
                if (hjVar == null) {
                    return 0;
                }
                return hjVar.f.size();
            default:
                return ((im0) this.d).f.size();
        }
    }

    @Override // v4.i0
    public long c(int i7) {
        switch (this.c) {
            case 0:
                j8 j8Var = (j8) this.d;
                return ((j8Var.J - (i7 / 12)) * 100) + (j8Var.K - (i7 % 12));
            case 1:
            default:
                return super.c(i7);
            case 2:
                if (i7 >= ((org.telegram.ui.Components.u8) this.d).f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.t8) r0.f3.get(i7)).a;
        }
    }

    @Override // v4.i0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7 >= ((org.telegram.ui.Components.u8) this.d).f3.size() ? 1 : 0;
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
                g8 g8Var = (g8) f1Var.a;
                j8 j8Var = (j8) obj;
                int i14 = j8Var.J - (i7 / 12);
                int i15 = j8Var.K - (i7 % 12);
                if (i15 < 0) {
                    i15 += 12;
                    i14--;
                }
                if (g8Var.b == i14) {
                    int i16 = g8Var.c;
                }
                SparseArray sparseArray2 = (SparseArray) j8Var.T.get((i14 * 100) + i15);
                j8 j8Var2 = g8Var.y;
                boolean z12 = (i14 == g8Var.b && i15 == g8Var.c) ? false : true;
                g8Var.b = i14;
                g8Var.c = i15;
                g8Var.n = sparseArray2;
                if (z12 && g8Var.r != null) {
                    for (int i17 = 0; i17 < g8Var.r.size(); i17++) {
                        ((ImageReceiver) g8Var.r.valueAt(i17)).S();
                        ((ImageReceiver) g8Var.r.valueAt(i17)).I0(null);
                    }
                    g8Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (g8Var.r == null) {
                        g8Var.r = new SparseArray();
                    }
                    int i18 = 0;
                    while (i18 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i18);
                        if (g8Var.r.get(keyAt, r42) == null && ((h8) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(r42);
                            imageReceiver.I0(g8Var);
                            org.telegram.messenger.fj fjVar = ((h8) sparseArray2.get(keyAt)).a;
                            if (fjVar != null) {
                                boolean t22 = fjVar.t2();
                                if (org.telegram.messenger.fj.L4(fjVar.k)) {
                                    TLRPC.Document F0 = fjVar.F0();
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F0.thumbs, 50, false, r42, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F0.thumbs, org.telegram.messenger.ks.r5, false, r42, false);
                                    if (w10 == w11) {
                                        w11 = r42;
                                    }
                                    if (w10 != null) {
                                        if (fjVar.I1 != null) {
                                            imageReceiver.r0(org.telegram.messenger.fc.c(w11, F0), t22 ? "5_5_b" : "44_44", fjVar.I1, null, fjVar, 0);
                                        } else {
                                            imageReceiver.u0(org.telegram.messenger.fc.c(w11, F0), t22 ? "5_5_b" : "44_44", org.telegram.messenger.fc.c(w10, F0), "b", null, fjVar, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = fjVar.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !fjVar.p0.isEmpty()) {
                                        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(fjVar.p0, 50, false, r42, false);
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(fjVar.p0, org.telegram.messenger.ks.r5, false, w12, false);
                                        if (!fjVar.z0) {
                                            i10 = ((org.telegram.ui.ActionBar.g2) j8Var2).currentAccount;
                                            if (!org.telegram.messenger.a6.q(i10).d(fjVar)) {
                                                BitmapDrawable bitmapDrawable = fjVar.I1;
                                                if (bitmapDrawable != null) {
                                                    imageReceiver.r0(null, null, bitmapDrawable, null, fjVar, 0);
                                                } else {
                                                    imageReceiver.u0(null, null, org.telegram.messenger.fc.f(w12, fjVar.n0), "b", null, fjVar, 0);
                                                }
                                            }
                                        }
                                        if (w13 == w12) {
                                            w12 = r42;
                                        }
                                        if (fjVar.I1 != null) {
                                            imageReceiver.s0(org.telegram.messenger.fc.f(w13, fjVar.n0), t22 ? "5_5_b" : "44_44", null, null, fjVar.I1, w13 != null ? w13.size : 0L, null, fjVar, org.telegram.messenger.fj.R5(fjVar.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.s0(org.telegram.messenger.fc.f(w13, fjVar.n0), t22 ? "5_5_b" : "44_44", org.telegram.messenger.fc.f(w12, fjVar.n0), "b", null, w13 != null ? w13.size : 0L, null, fjVar, org.telegram.messenger.fj.R5(fjVar.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.K0(org.telegram.messenger.g0.L(22.0f));
                                g8Var.r.put(keyAt, imageReceiver);
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
                g8Var.d = YearMonth.of(i14, i19).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i15, 0);
                g8Var.e = (calendar.get(7) + 6) % 7;
                g8Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i20 = g8Var.d + g8Var.e;
                g8Var.f = ((int) (i20 / 7.0f)) + (i20 % 7 == 0 ? 0 : 1);
                calendar.set(i14, i19, 0);
                g8Var.a.l(org.telegram.messenger.gd.e0(calendar.getTimeInMillis() / 1000, true), false);
                j8Var2.A0(g8Var, false);
                g8.a(g8Var, j8Var.Q, j8Var.R);
                g8.b(g8Var, 1.0f);
                j8Var.A0(g8Var, false);
                break;
            case 1:
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) f1Var.a;
                y80 y80Var = (y80) ((org.telegram.ui.Cells.t) obj).f3.get(i7);
                org.telegram.ui.Cells.q qVar = sVar.c;
                int i21 = y80Var.b;
                int i22 = y80Var.d;
                qVar.setImageResource(i21);
                TextView textView = sVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!y80Var.e || org.telegram.messenger.i10.o()) {
                    marginLayoutParams.rightMargin = 0;
                    textView.setText(org.telegram.messenger.gd.N0(i22, null));
                } else {
                    SpannableString spannableString = new SpannableString(i5.c.k(i22, null, new StringBuilder("d ")));
                    org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(R.drawable.msg_mini_premiumlock, 0);
                    kqVar.n = 1;
                    kqVar.c(org.telegram.messenger.g0.L(13.0f));
                    spannableString.setSpan(kqVar, 0, 1, 33);
                    marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                    textView.setText(spannableString);
                }
                sVar.b(c8.za.a(y80Var), false);
                int L = org.telegram.messenger.g0.L(18.0f);
                int i23 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.u6.Q(qVar, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, org.telegram.ui.ActionBar.n6.x0(null, i23, false), -16777216), null, org.telegram.ui.ActionBar.u6.M(i23), null);
                qVar.setForeground(y80Var.c);
                break;
            case 2:
                org.telegram.ui.Components.u8 u8Var = (org.telegram.ui.Components.u8) obj;
                org.telegram.ui.Components.x8 x8Var = u8Var.k3;
                ArrayList arrayList = u8Var.f3;
                org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) f1Var.a;
                if (f1Var.f != 0) {
                    v8Var.d = true;
                    i11 = ((org.telegram.ui.ActionBar.g2) x8Var).currentAccount;
                    boolean z13 = !org.telegram.messenger.i10.i(i11).q();
                    if (v8Var.w != z13) {
                        v8Var.w = z13;
                        v8Var.invalidate();
                    }
                    v8Var.a = u8Var.j3;
                    z10 = u8Var.h3 == 1;
                    if (v8Var.c != z10) {
                        v8Var.c = z10;
                        v8Var.invalidate();
                        break;
                    }
                } else {
                    v8Var.d = false;
                    org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) arrayList.get(i7);
                    if (t8Var.b) {
                        i12 = ((org.telegram.ui.ActionBar.g2) x8Var).currentAccount;
                        if (!org.telegram.messenger.i10.i(i12).q()) {
                            z11 = true;
                            if (v8Var.w != z11) {
                                v8Var.w = z11;
                                v8Var.invalidate();
                            }
                            v8Var.a = t8Var;
                            z10 = u8Var.h3 == ((org.telegram.ui.Components.t8) arrayList.get(i7)).a;
                            if (v8Var.c == z10) {
                                v8Var.c = z10;
                                v8Var.invalidate();
                                break;
                            }
                        }
                    }
                    z11 = false;
                    if (v8Var.w != z11) {
                    }
                    v8Var.a = t8Var;
                    if (u8Var.h3 == ((org.telegram.ui.Components.t8) arrayList.get(i7)).a) {
                    }
                    if (v8Var.c == z10) {
                    }
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                org.telegram.ui.Components.na0 na0Var = (org.telegram.ui.Components.na0) obj;
                di.b1 b1Var = na0Var.f;
                int i24 = na0Var.a;
                org.telegram.messenger.hj hjVar = na0Var.r;
                if (hjVar != null && f1Var.f == 0) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) f1Var.a;
                    r1Var.setInvalidateSpoilersParent(hjVar.i);
                    r1Var.A3(b1Var.getMeasuredWidth(), b1Var.getMeasuredHeight());
                    int e12 = r1Var.getMessageObject() != null ? r1Var.getMessageObject().e1() : 0;
                    if (i24 == 2) {
                        na0Var.d0.d.b((org.telegram.messenger.fj) na0Var.r.f.get(i7));
                    }
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) na0Var.r.f.get(i7);
                    org.telegram.messenger.hj hjVar2 = na0Var.r;
                    r1Var.y3(fjVar2, (org.telegram.messenger.aj) hjVar2.d.get(((org.telegram.messenger.fj) hjVar2.f.get(i7)).c1()), true, true, false, false);
                    if (i24 == 1) {
                        r1Var.setDelegate(new qb.a(18));
                    }
                    if (na0Var.r.f.size() > 1) {
                        r1Var.l3(i24 == 1, false);
                        boolean z14 = e12 == ((org.telegram.messenger.fj) na0Var.r.f.get(i7)).e1();
                        org.telegram.messenger.hj hjVar3 = na0Var.r;
                        boolean z15 = hjVar3.g.get(((org.telegram.messenger.fj) hjVar3.f.get(i7)).e1(), false);
                        r1Var.n3(z15, z15, z14);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) f1Var.a;
                im0 im0Var = (im0) obj;
                textView2.setText((CharSequence) im0Var.f.get(i7));
                textView2.setTextColor(i7 == im0Var.d ? im0Var.F : im0Var.E);
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        switch (this.c) {
            case 0:
                return new org.telegram.ui.Components.mj0(new g8((j8) this.d, viewGroup.getContext()));
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
                sVar.addView(qVar, c8.na.r(58, 58, 1));
                TextView textView = new TextView(context);
                sVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                sVar.addView(textView, c8.na.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(0.5f)));
                paint2.setColor(-1);
                return new org.telegram.ui.Components.mj0(sVar);
            case 2:
                org.telegram.ui.Components.u8 u8Var = (org.telegram.ui.Components.u8) this.d;
                return new org.telegram.ui.Components.mj0(new org.telegram.ui.Components.v8(u8Var.k3, u8Var.getContext()));
            case 3:
                return new org.telegram.ui.Components.mj0(((org.telegram.ui.Components.pm) this.d).w);
            case 4:
                return new org.telegram.ui.Components.mj0(new bi.o3(17, ((org.telegram.ui.Components.rn) this.d).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                org.telegram.ui.Components.na0 na0Var = (org.telegram.ui.Components.na0) this.d;
                org.telegram.ui.Components.ta0 ta0Var = na0Var.d0;
                org.telegram.ui.Components.la0 la0Var = new org.telegram.ui.Components.la0(this, context2, ta0Var.x, na0Var.K, ta0Var.G);
                la0Var.setClipChildren(false);
                la0Var.setClipToPadding(false);
                la0Var.setDelegate(new org.telegram.ui.Components.ma0(this));
                return new org.telegram.ui.Components.mj0(la0Var);
            default:
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(viewGroup.getContext(), null);
                j80Var.setGravity(17);
                j80Var.setTypeface(org.telegram.messenger.g0.o());
                j80Var.setTextSize(1, 14.0f);
                j80Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                j80Var.setEllipsize(TextUtils.TruncateAt.END);
                j80Var.setSingleLine();
                j80Var.setMaxLines(1);
                j80Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(28.0f)));
                c8.sa.b(j80Var, 0.075f, 1.4f);
                return new org.telegram.ui.Components.mj0(j80Var);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        int i7;
        int i10;
        switch (this.c) {
            case 5:
                org.telegram.ui.Components.na0 na0Var = (org.telegram.ui.Components.na0) this.d;
                org.telegram.ui.Components.ha0 ha0Var = na0Var.e;
                org.telegram.ui.Components.ta0 ta0Var = na0Var.d0;
                if (na0Var.r != null && (i7 = na0Var.a) != 1) {
                    View view = f1Var.a;
                    if (view instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) view;
                        if (i7 != 0) {
                            r1Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            org.telegram.messenger.aj a10 = org.telegram.ui.Components.na0.a(na0Var, r1Var.getMessageObject());
                            r1Var.setDrawSelectionBackground(a10 == null);
                            r1Var.n3(true, a10 == null, false);
                            org.telegram.messenger.jj jjVar = ta0Var.d;
                            if (!jjVar.i && jjVar.d != null && na0Var.e(r1Var)) {
                                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                                org.telegram.messenger.jj jjVar2 = ta0Var.d;
                                org.telegram.messenger.jj jjVar3 = ta0Var.d;
                                rm rmVar = jjVar3.d;
                                if (rmVar.m && messageObject != null && messageObject.y2 != null && ((i10 = jjVar3.e) < 0 || jjVar3.f <= i10)) {
                                    String str = rmVar.i;
                                    int[] f10 = str == null ? null : org.telegram.messenger.iv.f(messageObject, str, rmVar.o);
                                    if (f10 != null) {
                                        jjVar2.e = f10[0];
                                        jjVar2.f = f10[1];
                                    } else {
                                        jjVar2.e = 0;
                                        jjVar2.f = Math.min(org.telegram.messenger.mp.u1(ta0Var.x).r4, rm.d(messageObject));
                                    }
                                }
                            }
                            org.telegram.messenger.jj jjVar4 = ta0Var.d;
                            if (!jjVar4.i && jjVar4.d != null && jjVar4.e >= 0 && na0Var.e(r1Var) && !ha0Var.x()) {
                                org.telegram.messenger.jj jjVar5 = ta0Var.d;
                                ha0Var.a0(r1Var, jjVar5.e, jjVar5.f);
                                if (na0Var.c0) {
                                    na0Var.M = D(r1Var, ta0Var.d.e, false);
                                    na0Var.N = D(r1Var, ta0Var.d.f, true);
                                    na0Var.O = true;
                                    na0Var.c0 = false;
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
