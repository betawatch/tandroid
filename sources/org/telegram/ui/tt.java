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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class tt extends org.telegram.ui.Components.bb {
    public final FrameLayout X;
    public final ei.d Y;
    public final ei.d Z;
    public final ArrayList a0;
    public final HashSet b0;
    public boolean c0;
    public org.telegram.ui.Components.b71 d0;

    public tt(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new ci.b());
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.b0 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        fixNavigationBarKey(org.telegram.ui.ActionBar.k6.h5);
        this.drawDoubleNavigationBar = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X = frameLayout;
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 1);
        frameLayout.addView(f7, w7.z5.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        w7.b6.a(imageView);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.st
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
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i11, this.resourcesProvider));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, g6Var);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.filled_calls_users);
        frameLayout2.addView(imageView2, w7.z5.e(56, 56, 17));
        f7.addView(frameLayout2, w7.z5.t(80, 80, 1, 2, 21, 2, 13));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.y90 a2 = w7.d6.a(activity, 20.0f, i12, true, this.resourcesProvider);
        a2.setText(LocaleController.getString(R.string.GroupCallCreateTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.z5.t(-1, -2, 1, 2, 0, 2, 4));
        org.telegram.ui.Components.y90 a10 = w7.d6.a(activity, 14.0f, i12, false, this.resourcesProvider);
        a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallCreateText)));
        a10.setGravity(17);
        a10.setMaxWidth(ei.x3.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.z5.t(-1, -2, 1, 2, 0, 2, 23));
        org.telegram.ui.Components.b71 b71Var = this.d0;
        if (b71Var != null) {
            b71Var.N(false);
        }
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        this.d.setOnItemClickListener(new a1(this, 28));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout f10 = org.telegram.messenger.v0.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        frameLayout3.addView(f10, w7.z5.e(-1, -2, 87));
        ei.d dVar = new ei.d(activity, this.resourcesProvider, true);
        this.Y = dVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.profile_phone, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
        dVar.i(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.z5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        final int i13 = 1;
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.st
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
        ei.d dVar2 = new ei.d(activity, this.resourcesProvider, true);
        this.Z = dVar2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xq(R.drawable.profile_video, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
        dVar2.i(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        final int i14 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.st
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
        this.containerView.addView(frameLayout3, w7.z5.e(-1, -2, 87));
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(76.0f));
    }

    public static void Q(tt ttVar, TLObject tLObject, ei.d dVar, boolean z10, HashSet hashSet, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    org.telegram.ui.Cells.b1.s(ttVar.topBulletinContainer, ttVar.resourcesProvider, tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(ttVar.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(ttVar.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.J1 == null) {
                ttVar.c0 = false;
                dVar.setLoading(false);
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ttVar.dismiss();
            org.telegram.ui.Components.voip.d2.g(LaunchActivity.J1, ttVar.currentAccount, tL_inputGroupCall, z10, groupcall.call, hashSet);
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
        Utilities.stageQueue.postRunnable(new ot(1, ttVar, updates));
        if (groupCall2 == null || LaunchActivity.J1 == null) {
            ttVar.c0 = false;
            dVar.setLoading(false);
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        ttVar.dismiss();
        org.telegram.ui.Components.voip.d2.g(LaunchActivity.J1, ttVar.currentAccount, tL_inputGroupCall2, z10, groupCall2, hashSet);
    }

    public static void R(tt ttVar, ArrayList arrayList) {
        arrayList.add(org.telegram.ui.Components.m61.k(ttVar.X));
        arrayList.add(org.telegram.ui.Components.m61.B(null));
        ArrayList arrayList2 = ttVar.a0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        i2.o1.q(R.string.GroupCallCreateAddMembers, arrayList);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Long l4 = (Long) arrayList2.get(i10);
            l4.getClass();
            TLRPC.User user = MessagesController.getInstance(ttVar.currentAccount).getUser(l4);
            if (user == null) {
                return;
            }
            int i11 = yg.j.a;
            org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(yg.j.class);
            J.G = user;
            J.K(ttVar.b0.contains(l4));
            arrayList.add(J);
        }
    }

    public final void S(boolean z10) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        ei.d dVar = z10 ? this.Z : this.Y;
        dVar.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.b0);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.random.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new ai.i4(this, dVar, z10, hashSet, 6));
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.lm0 w(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(mm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 10), this.resourcesProvider);
        this.d0 = b71Var;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(R.string.GroupCallCreateTitle);
    }
}
