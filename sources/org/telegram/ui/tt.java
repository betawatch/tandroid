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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tt extends org.telegram.ui.Components.bb {
    public final FrameLayout X;
    public final fi.d Y;
    public final fi.d Z;
    public final ArrayList a0;
    public final HashSet b0;
    public boolean c0;
    public org.telegram.ui.Components.k71 d0;

    public tt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new di.b());
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout f7 = org.telegram.messenger.t.f(activity, 1);
        frameLayout.addView(f7, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, org.telegram.ui.Components.kb1.h(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.kb1.b(imageView);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rt
            public final /* synthetic */ tt b;

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
                        this.b.S(false);
                        break;
                    default:
                        this.b.S(true);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i11, this.resourcesProvider));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, u6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, org.telegram.ui.Components.kb1.i(56, 56, 17));
        f7.addView(frameLayout2, org.telegram.ui.Components.kb1.x(80, 80, 1, 2, 21, 2, 13));
        int i12 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.Components.aa0 K2 = org.telegram.ui.Components.kb1.K(activity, 20.0f, i12, true, this.resourcesProvider);
        K2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        K2.setGravity(17);
        f7.addView(K2, org.telegram.ui.Components.kb1.x(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.aa0 K3 = org.telegram.ui.Components.kb1.K(activity, 14.0f, i12, false, this.resourcesProvider);
        K3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        K3.setGravity(17);
        K3.setMaxWidth(fi.v3.a(K3.getText(), K3.getPaint()));
        f7.addView(K3, org.telegram.ui.Components.kb1.x(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.k71 k71Var = this.d0;
        if (k71Var != null) {
            k71Var.O(false);
        }
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new st(this, 0));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.t.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, org.telegram.ui.Components.kb1.i(-1, -2, 87));
        fi.d dVar = new fi.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.i(spannableStringBuilder, false, true);
        f10.addView(dVar, org.telegram.ui.Components.kb1.t(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        final int i13 = 1;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rt
            public final /* synthetic */ tt b;

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
                        this.b.S(false);
                        break;
                    default:
                        this.b.S(true);
                        break;
                }
            }
        });
        fi.d dVar2 = new fi.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.zq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.i(spannableStringBuilder2, false, true);
        f10.addView(dVar2, org.telegram.ui.Components.kb1.t(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        final int i14 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rt
            public final /* synthetic */ tt b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.S(false);
                        break;
                    default:
                        this.b.S(true);
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout3, org.telegram.ui.Components.kb1.i(-1, -2, 87));
        org.telegram.ui.Components.nm0 nm0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(76.0f));
    }

    public static void Q(tt ttVar, TLObject tLObject, fi.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    d3.t(ttVar.topBulletinContainer, ttVar.resourcesProvider, tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(ttVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(ttVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.I1 == null) {
                ttVar.c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ttVar.dismiss();
            org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, ttVar.currentAccount, tL_inputGroupCall, z10, groupcall.call, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(ttVar.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(ttVar.currentAccount).putChats(updates.chats, false);
        ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
        int size = findUpdates.size();
        TLRPC.GroupCall groupCall2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = findUpdates.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.d71(20, ttVar, updates));
        if (groupCall2 == null || LaunchActivity.I1 == null) {
            ttVar.c0 = false;
            dVar.setLoading(false);
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        ttVar.dismiss();
        org.telegram.ui.Components.voip.g2.g(LaunchActivity.I1, ttVar.currentAccount, tL_inputGroupCall2, z10, groupCall2, hashSet);
    }

    public static void R(tt ttVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.u61.k(ttVar.X));
        arrayList.add(org.telegram.ui.Components.u61.C(null));
        ArrayList arrayList2 = ttVar.a0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        ic.a.p(R.string.GroupCallCreateAddMembers, arrayList);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Long l4 = (Long) arrayList2.get(i10);
            l4.getClass();
            TLRPC.User user = MessagesController.getInstance(ttVar.currentAccount).getUser(l4);
            if (user == null) {
                return;
            }
            int i11 = zg.k.a;
            org.telegram.ui.Components.u61 K = org.telegram.ui.Components.u61.K(zg.k.class);
            K.G = user;
            K.L(ttVar.b0.contains(l4));
            arrayList.add(K);
        }
    }

    public final void S(boolean z10) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        fi.d dVar = z10 ? this.Z : this.Y;
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new bi.d4(this, dVar, z10, hashSet, 6));
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.mm0 v(org.telegram.ui.Components.nm0 nm0Var) {
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(nm0Var, getContext(), this.currentAccount, 0, true, new e5(this, 10), this.resourcesProvider);
        this.d0 = k71Var;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
