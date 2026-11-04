package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qs extends org.telegram.ui.Components.ma {
    public final FrameLayout Q1;
    public final gi.d R1;
    public final gi.d S1;
    public final ArrayList T1;
    public final HashSet U1;
    public boolean V1;
    public org.telegram.ui.Components.f41 W1;

    public qs(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new ei.b());
        ArrayList arrayList = new ArrayList();
        this.T1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.U1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        P(org.telegram.ui.ActionBar.k6.h5);
        final int i3 = 0;
        this.s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Q1 = frameLayout;
        final int i10 = 1;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        frameLayout.addView(e10, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        b8.pf.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ps
            public final /* synthetic */ qs b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.d1(false);
                        break;
                    default:
                        this.b.d1(true);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, this.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, e6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, b8.mf.e(56, 56, 17));
        e10.addView(frameLayout2, b8.mf.t(80, 80, 1, 2, 21, 2, 13));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.s70 a10 = b8.rf.a(activity, 20.0f, i12, true, this.J0);
        a10.setText(org.telegram.messenger.bd.M0(2131749491, null));
        a10.setGravity(17);
        e10.addView(a10, b8.mf.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.s70 a11 = b8.rf.a(activity, 14.0f, i12, false, this.J0);
        a11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749492, null)));
        a11.setGravity(17);
        a11.setMaxWidth(gi.l3.a(a11.getText(), a11.getPaint()));
        e10.addView(a11, b8.mf.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.f41 f41Var = this.W1;
        if (f41Var != null) {
            f41Var.O(false);
        }
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        this.l1.setOnItemClickListener(new ur(this, i10));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 0);
        e11.setPadding(org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(14.0f));
        frameLayout3.addView(e11, b8.mf.e(-1, -2, 87));
        gi.d dVar = new gi.d(activity, this.J0, true);
        this.R1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749489, null));
        dVar.i(spannableStringBuilder, false, true);
        e11.addView(dVar, b8.mf.q(-1, 48, 1.0f, org.telegram.messenger.hs.E1, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ps
            public final /* synthetic */ qs b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.d1(false);
                        break;
                    default:
                        this.b.d1(true);
                        break;
                }
            }
        });
        gi.d dVar2 = new gi.d(activity, this.J0, true);
        this.S1 = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131749490, null));
        dVar2.i(spannableStringBuilder2, false, true);
        e11.addView(dVar2, b8.mf.q(-1, 48, 1.0f, org.telegram.messenger.hs.E1, 6, 0, 0, 0));
        final int i13 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ps
            public final /* synthetic */ qs b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.d1(false);
                        break;
                    default:
                        this.b.d1(true);
                        break;
                }
            }
        });
        this.b.addView(frameLayout3, b8.mf.e(-1, -2, 87));
        org.telegram.ui.Components.tj0 tj0Var = this.l1;
        int i14 = this.u0;
        tj0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(76.0f));
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.a, 0, true, new c5(this, 10), this.J0);
        this.W1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131749491, null);
    }

    public final void d1(boolean z10) {
        if (this.V1) {
            return;
        }
        this.V1 = true;
        gi.d dVar = z10 ? this.S1 : this.R1;
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.U1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.b.nextInt();
        ConnectionsManager.getInstance(this.a).sendRequest(createconferencecall, new ci.o3(this, dVar, z10, hashSet, 7));
    }
}
