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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ss extends org.telegram.ui.Components.na {
    public final FrameLayout P1;
    public final fi.d Q1;
    public final fi.d R1;
    public final ArrayList S1;
    public final HashSet T1;
    public boolean U1;
    public org.telegram.ui.Components.f41 V1;

    public ss(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new di.b());
        ArrayList arrayList = new ArrayList();
        this.S1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.T1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        P(org.telegram.ui.ActionBar.k6.h5);
        final int i7 = 0;
        this.s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.P1 = frameLayout;
        final int i10 = 1;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        frameLayout.addView(e10, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        c8.ka.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rs
            public final /* synthetic */ ss b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
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
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, this.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L2, N, null, f6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, c8.ha.e(56, 56, 17));
        e10.addView(frameLayout2, c8.ha.t(80, 80, 1, 2, 21, 2, 13));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.w70 a10 = c8.na.a(activity, 20.0f, i12, true, this.I0);
        a10.setText(org.telegram.messenger.hd.M0(2131749482, null));
        a10.setGravity(17);
        e10.addView(a10, c8.ha.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.w70 a11 = c8.na.a(activity, 14.0f, i12, false, this.I0);
        a11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749483, null)));
        a11.setGravity(17);
        a11.setMaxWidth(fi.m3.a(a11.getText(), a11.getPaint()));
        e10.addView(a11, c8.ha.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.f41 f41Var = this.V1;
        if (f41Var != null) {
            f41Var.O(false);
        }
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        this.k1.setOnItemClickListener(new wr(this, i10));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout e11 = org.telegram.messenger.k5.e(activity, 0);
        e11.setPadding(org.telegram.messenger.g0.L(14.0f) + this.t0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f) + this.t0, org.telegram.messenger.g0.L(14.0f));
        frameLayout3.addView(e11, c8.ha.e(-1, -2, 87));
        fi.d dVar = new fi.d(activity, this.I0, true);
        this.Q1 = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749480, null));
        dVar.i(spannableStringBuilder, false, true);
        e11.addView(dVar, c8.ha.q(-1, 48, 1.0f, org.telegram.messenger.qs.E1, 0, 0, 6, 0));
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rs
            public final /* synthetic */ ss b;

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
        fi.d dVar2 = new fi.d(activity, this.I0, true);
        this.R1 = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.wp(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749481, null));
        dVar2.i(spannableStringBuilder2, false, true);
        e11.addView(dVar2, c8.ha.q(-1, 48, 1.0f, org.telegram.messenger.qs.E1, 6, 0, 0, 0));
        final int i13 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rs
            public final /* synthetic */ ss b;

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
        this.b.addView(frameLayout3, c8.ha.e(-1, -2, 87));
        org.telegram.ui.Components.pj0 pj0Var = this.k1;
        int i14 = this.t0;
        pj0Var.setPadding(i14, 0, i14, org.telegram.messenger.g0.L(76.0f));
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(pj0Var, getContext(), this.a, 0, true, new a5(this, 10), this.I0);
        this.V1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131749482, null);
    }

    public final void d1(boolean z9) {
        if (this.U1) {
            return;
        }
        this.U1 = true;
        fi.d dVar = z9 ? this.R1 : this.Q1;
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.T1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.b.nextInt();
        ConnectionsManager.getInstance(this.a).sendRequest(createconferencecall, new bi.d4(this, dVar, z9, hashSet, 7));
    }
}
