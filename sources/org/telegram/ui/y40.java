package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y40 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public TLRPC.VideoSize I;
    public String J;
    public double K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public org.telegram.ui.Components.f30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.ch0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.jy Y;
    public x40 Z;
    public w40 a;
    public org.telegram.ui.Components.tj0 b;
    public org.telegram.ui.Components.jt c;
    public ei.d4 d;
    public gi.n5 e;
    public xc f;
    public AnimatorSet h;
    public yc n;
    public final org.telegram.ui.Components.u8 r;
    public FrameLayout s;
    public org.telegram.ui.Components.l00 w;
    public org.telegram.ui.ActionBar.f1 x;
    public Drawable y;

    public y40(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static /* synthetic */ void Z(y40 y40Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.qr.a0(y40Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
        yc ycVar = this.n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0358  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i3;
        org.telegram.ui.Components.jt jtVar = this.c;
        if (jtVar != null) {
            jtVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748281, null));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i11, kVar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 6));
        wc wcVar = new wc(2, context, this);
        org.telegram.ui.ActionBar.r6.i(i11, wcVar, getResourceProvider());
        this.fragmentView = wcVar;
        wcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fragmentView.setOnTouchListener(new fi.a(2));
        this.y = context.getResources().getDrawable(R.drawable.greydivider_top).mutate();
        s51 s51Var = new s51(19, context, this);
        s51Var.setOrientation(1);
        wcVar.addView(s51Var, b8.mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        InsetDrawable f02 = org.telegram.ui.ActionBar.k6.f0(L, getThemedColor(i13));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        frameLayout.setBackground(f02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, f02, N, null, resourceProvider);
        s51Var.addView(this.s, b8.mf.k(9.0f, 0.0f, 9.0f, 0.0f, -1, -2));
        ei.d4 d4Var = new ei.d4(9, context, this);
        this.d = d4Var;
        int i14 = this.Q;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(i14 == 5 ? 16.0f : 32.0f));
        org.telegram.ui.Components.u8 u8Var = this.r;
        u8Var.k(5L, null, null, null);
        this.d.setImageDrawable(u8Var);
        this.d.setContentDescription(org.telegram.messenger.bd.M0(2131752123, null));
        FrameLayout frameLayout2 = this.s;
        ei.d4 d4Var2 = this.d;
        boolean z10 = org.telegram.messenger.bd.a0;
        frameLayout2.addView(d4Var2, b8.mf.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 16.0f, z10 ? 16.0f : 0.0f, 16.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        gi.n5 n5Var = new gi.n5(this, context, paint, 12);
        this.e = n5Var;
        FrameLayout frameLayout3 = this.s;
        boolean z11 = org.telegram.messenger.bd.a0;
        frameLayout3.addView(n5Var, b8.mf.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 16.0f, z11 ? 16.0f : 0.0f, 16.0f));
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s40
            public final /* synthetic */ y40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        y40 y40Var = this.b;
                        y40Var.O.n(y40Var.E != null, new fz(y40Var, 8), new s5(y40Var, 7), 0);
                        y40Var.S.M(0);
                        y40Var.S.P(43);
                        y40Var.f.d();
                        break;
                    default:
                        y40 y40Var2 = this.b;
                        if (!y40Var2.N) {
                            if (y40Var2.c.a.length() != 0) {
                                y40Var2.N = true;
                                org.telegram.messenger.g0.v1(y40Var2.c);
                                y40Var2.c.setEnabled(false);
                                if (!y40Var2.O.g()) {
                                    org.telegram.ui.Components.l00 l00Var = y40Var2.w;
                                    if (l00Var != null) {
                                        l00Var.f(true, true);
                                    }
                                    y40Var2.W = y40Var2.getMessagesController().U(y40Var2.c.getText().toString(), y40Var2.L, null, y40Var2.Q, y40Var2.T, y40Var2.V, y40Var2.U, y40Var2.X, y40Var2);
                                    break;
                                } else {
                                    y40Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) y40Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(y40Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.S = new org.telegram.ui.Components.ch0(R.raw.camera, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        xc xcVar = new xc(3, context, this);
        this.f = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setAnimation(this.S);
        this.f.setEnabled(false);
        this.f.setClickable(false);
        this.f.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
        FrameLayout frameLayout4 = this.s;
        xc xcVar2 = this.f;
        boolean z12 = org.telegram.messenger.bd.a0;
        frameLayout4.addView(xcVar2, b8.mf.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 16.0f, z12 ? 15.0f : 0.0f, 16.0f));
        yc ycVar = new yc(this, context, i10);
        this.n = ycVar;
        ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
        this.n.setProgressColor(-1);
        this.n.setNoProgress(false);
        FrameLayout frameLayout5 = this.s;
        yc ycVar2 = this.n;
        boolean z13 = org.telegram.messenger.bd.a0;
        frameLayout5.addView(ycVar2, b8.mf.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 16.0f, z13 ? 16.0f : 0.0f, 16.0f));
        e0(false, false);
        org.telegram.ui.Components.jt jtVar2 = new org.telegram.ui.Components.jt(context, wcVar, this, 0, false, null);
        this.c = jtVar2;
        jtVar2.setHint(org.telegram.messenger.bd.M0((i14 == 0 || i14 == 4 || i14 == 5) ? 2131751123 : 2131751122, null));
        String str = this.P;
        if (str != null) {
            this.c.setText(str);
            org.telegram.ui.Components.jt jtVar3 = this.c;
            jtVar3.setSelection(jtVar3.getText().length());
            this.P = null;
        }
        TLRPC.User f10 = getUserConfig().f();
        int size = this.L.size() + 1;
        if (size < 2 || size > 5 || !TextUtils.isEmpty(this.c.getText())) {
            i3 = 2;
        } else {
            String str2 = "";
            try {
                if (size != 2) {
                    if (size == 3) {
                        str2 = org.telegram.messenger.bd.a0("GroupCreateMembersThree", null, 2131749459, f10.first_name, d0(0), d0(1));
                    } else if (size == 4) {
                        str2 = org.telegram.messenger.bd.a0("GroupCreateMembersFour", null, 2131749460, f10.first_name, d0(0), d0(1), d0(2));
                    } else if (size == 5) {
                        str2 = org.telegram.messenger.bd.a0("GroupCreateMembersFive", null, 2131749461, f10.first_name, d0(0), d0(1), d0(2), d0(3));
                    }
                    i3 = 2;
                } else {
                    i3 = 2;
                    try {
                        str2 = org.telegram.messenger.bd.a0("GroupCreateMembersTwo", null, 2131749458, f10.first_name, d0(0));
                    } catch (Exception e10) {
                        e = e10;
                        org.telegram.messenger.a8.g(e, true);
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                        FrameLayout frameLayout6 = this.s;
                        org.telegram.ui.Components.jt jtVar4 = this.c;
                        boolean z14 = org.telegram.messenger.bd.a0;
                        frameLayout6.addView(jtVar4, b8.mf.d(-1, -2.0f, 16, !z14 ? 5.0f : 96.0f, 0.0f, !z14 ? 96.0f : 5.0f, 0.0f));
                        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
                        this.b = tj0Var;
                        tj0Var.r1();
                        this.Y = new org.telegram.ui.Components.jy(1, this.b);
                        org.telegram.ui.Components.tj0 tj0Var2 = this.b;
                        w40 w40Var = new w40(this, context);
                        this.a = w40Var;
                        tj0Var2.setAdapter(w40Var);
                        this.b.setLayoutManager(this.Y);
                        this.b.setVerticalScrollBarEnabled(false);
                        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.bd.a0 ? 1 : i3);
                        s51Var.addView(this.b, b8.mf.o(-1, -1));
                        this.b.setOnScrollListener(new h3(this, 15));
                        this.b.setOnItemClickListener(new t40(this));
                        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
                        this.w = l00Var;
                        k4.j.k(l00Var);
                        wcVar.addView(this.w, org.telegram.ui.Components.l00.b());
                        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s40
                            public final /* synthetic */ y40 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        y40 y40Var = this.b;
                                        y40Var.O.n(y40Var.E != null, new fz(y40Var, 8), new s5(y40Var, 7), 0);
                                        y40Var.S.M(0);
                                        y40Var.S.P(43);
                                        y40Var.f.d();
                                        break;
                                    default:
                                        y40 y40Var2 = this.b;
                                        if (!y40Var2.N) {
                                            if (y40Var2.c.a.length() != 0) {
                                                y40Var2.N = true;
                                                org.telegram.messenger.g0.v1(y40Var2.c);
                                                y40Var2.c.setEnabled(false);
                                                if (!y40Var2.O.g()) {
                                                    org.telegram.ui.Components.l00 l00Var2 = y40Var2.w;
                                                    if (l00Var2 != null) {
                                                        l00Var2.f(true, true);
                                                    }
                                                    y40Var2.W = y40Var2.getMessagesController().U(y40Var2.c.getText().toString(), y40Var2.L, null, y40Var2.Q, y40Var2.T, y40Var2.V, y40Var2.U, y40Var2.X, y40Var2);
                                                    break;
                                                } else {
                                                    y40Var2.M = true;
                                                    break;
                                                }
                                            } else {
                                                Vibrator vibrator = (Vibrator) y40Var2.getParentActivity().getSystemService("vibrator");
                                                if (vibrator != null) {
                                                    vibrator.vibrate(200L);
                                                }
                                                org.telegram.messenger.g0.F3(y40Var2.c);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        this.w.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
                        this.w.c.setImageResource(R.drawable.checkbig);
                        return this.fragmentView;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                i3 = 2;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.c.setText(str2);
                org.telegram.ui.Components.jt jtVar5 = this.c;
                jtVar5.w(0, jtVar5.getText().length());
            }
        }
        this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        FrameLayout frameLayout62 = this.s;
        org.telegram.ui.Components.jt jtVar42 = this.c;
        boolean z142 = org.telegram.messenger.bd.a0;
        frameLayout62.addView(jtVar42, b8.mf.d(-1, -2.0f, 16, !z142 ? 5.0f : 96.0f, 0.0f, !z142 ? 96.0f : 5.0f, 0.0f));
        org.telegram.ui.Components.tj0 tj0Var3 = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var3;
        tj0Var3.r1();
        this.Y = new org.telegram.ui.Components.jy(1, this.b);
        org.telegram.ui.Components.tj0 tj0Var22 = this.b;
        w40 w40Var2 = new w40(this, context);
        this.a = w40Var2;
        tj0Var22.setAdapter(w40Var2);
        this.b.setLayoutManager(this.Y);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setVerticalScrollbarPosition(!org.telegram.messenger.bd.a0 ? 1 : i3);
        s51Var.addView(this.b, b8.mf.o(-1, -1));
        this.b.setOnScrollListener(new h3(this, 15));
        this.b.setOnItemClickListener(new t40(this));
        org.telegram.ui.Components.l00 l00Var2 = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.w = l00Var2;
        k4.j.k(l00Var2);
        wcVar.addView(this.w, org.telegram.ui.Components.l00.b());
        this.w.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.s40
            public final /* synthetic */ y40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        y40 y40Var = this.b;
                        y40Var.O.n(y40Var.E != null, new fz(y40Var, 8), new s5(y40Var, 7), 0);
                        y40Var.S.M(0);
                        y40Var.S.P(43);
                        y40Var.f.d();
                        break;
                    default:
                        y40 y40Var2 = this.b;
                        if (!y40Var2.N) {
                            if (y40Var2.c.a.length() != 0) {
                                y40Var2.N = true;
                                org.telegram.messenger.g0.v1(y40Var2.c);
                                y40Var2.c.setEnabled(false);
                                if (!y40Var2.O.g()) {
                                    org.telegram.ui.Components.l00 l00Var22 = y40Var2.w;
                                    if (l00Var22 != null) {
                                        l00Var22.f(true, true);
                                    }
                                    y40Var2.W = y40Var2.getMessagesController().U(y40Var2.c.getText().toString(), y40Var2.L, null, y40Var2.Q, y40Var2.T, y40Var2.V, y40Var2.U, y40Var2.X, y40Var2);
                                    break;
                                } else {
                                    y40Var2.M = true;
                                    break;
                                }
                            } else {
                                Vibrator vibrator = (Vibrator) y40Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(y40Var2.c);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.w.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
        this.w.c.setImageResource(R.drawable.checkbig);
        return this.fragmentView;
    }

    public final String d0(int i3) {
        return getMessagesController().a2((Long) this.L.get(i3)).first_name;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.r) {
            if (this.b == null) {
                return;
            }
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            int childCount = this.b.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.b.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.h4) {
                    ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.l00 l00Var = this.w;
            if (l00Var != null) {
                l00Var.f(false, true);
            }
            org.telegram.ui.Components.jt jtVar = this.c;
            if (jtVar != null) {
                jtVar.setEnabled(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            x40 x40Var = this.Z;
            if (x40Var != null) {
                x40Var.d(this, longValue);
            } else {
                org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new wm(bundle), true);
            }
            if (this.G == null && this.H == null && this.I == null) {
                return;
            }
            getMessagesController().B(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.O.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i3 = 0;
        if (!z11) {
            if (z10) {
                this.f.setAlpha(1.0f);
                this.f.setVisibility(4);
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                return;
            }
            this.f.setAlpha(1.0f);
            this.f.setVisibility(0);
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            return;
        }
        this.h = new AnimatorSet();
        if (z10) {
            this.n.setVisibility(0);
            AnimatorSet animatorSet2 = this.h;
            xc xcVar = this.f;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, (Property<xc, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.n, (Property<yc, Float>) property, 1.0f));
        } else {
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            xc xcVar2 = this.f;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, (Property<xc, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.n, (Property<yc, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new u40(i3, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.O.h(i3, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.c;
        if (jtVar == null || !jtVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        jtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        y40 y40Var;
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.S);
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(2, true, true);
        this.O = f30Var;
        f30Var.a = this;
        f30Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i3 = 0;
            while (i3 < longArray.length) {
                i3 = a1.g.h(i3, 1, longArray[i3], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            Long l10 = (Long) this.L.get(i10);
            if (getMessagesController().a2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (arrayList.isEmpty()) {
            y40Var = this;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            y40Var = this;
            org.telegram.messenger.qr.a0(this.currentAccount).a.c(new org.telegram.ui.Components.v60(y40Var, arrayList2, arrayList, countDownLatch, 16));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                getMessagesController().X3((TLRPC.User) obj, true, false);
            }
        }
        y40Var.X = getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.r);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.jt jtVar = this.c;
        if (jtVar != null) {
            jtVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.jt jtVar = this.c;
        if (jtVar != null) {
            jtVar.r();
        }
        this.O.i();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        this.O.j(i3, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.jt jtVar = this.c;
        if (jtVar != null) {
            jtVar.s();
        }
        w40 w40Var = this.a;
        if (w40Var != null) {
            w40Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.l00 l00Var = this.w;
            if (l00Var != null) {
                l00Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.tj0 tj0Var = this.b;
            if (tj0Var != null) {
                tj0Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.jt jtVar = this.c;
            if (jtVar == null || jtVar.getEditText() == null) {
                return;
            }
            this.c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            this.c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.k6.k6), getThemedColor(org.telegram.ui.ActionBar.k6.l6), getThemedColor(org.telegram.ui.ActionBar.k6.p7));
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.dt dtVar = this.c.a;
            dtVar.requestFocus();
            org.telegram.messenger.g0.K3(dtVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.f30 f30Var = this.O;
        if (f30Var != null) {
            f30Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.jt jtVar = this.c;
            if (jtVar != null) {
                jtVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.f30 f30Var = this.O;
        if (f30Var != null && (str = f30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.jt jtVar = this.c;
        if (jtVar != null) {
            String obj = jtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }
}
