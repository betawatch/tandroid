package th;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.ot;
import org.telegram.messenger.t10;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.sr;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u2 extends k.a {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ o7 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ x2 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ z2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(z2 z2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.p6 p6Var2, o7 o7Var, boolean z10, boolean z11, boolean z12, Context context2, x2 x2Var, boolean[] zArr) {
        super(context, p6Var, true);
        this.x = z2Var;
        this.d = p6Var2;
        this.e = o7Var;
        this.f = z10;
        this.h = z11;
        this.n = z12;
        this.r = context2;
        this.s = x2Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0163, code lost:
    
        if (r15.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (r14.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0150, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0962, code lost:
    
        if (r2.bot_can_edit == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0990, code lost:
    
        if (r2.delete_stories == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x099b, code lost:
    
        if (r0.delete_stories == false) goto L361;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0448  */
    @Override // k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        org.telegram.ui.ActionBar.p6 p6Var;
        TL_stories.StoryItem storyItem2;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        o7 o7Var;
        u2 u2Var;
        String L0;
        final o7 o7Var2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final u2 u2Var2;
        org.telegram.ui.ActionBar.p6 p6Var2;
        String str;
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        int i12;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        s0 s0Var;
        TLRPC.GroupCall groupCall;
        s0 s0Var2;
        String str2;
        int i13;
        String str3;
        int i14;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        TLObject tLObject;
        vh.n5 n5Var;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet j12;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet j13;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.User user;
        TLRPC.Chat L02;
        TLObject tLObject2;
        final u2 u2Var3;
        String str4;
        o7 o7Var3;
        org.telegram.ui.ActionBar.p6 p6Var3;
        final int i15;
        final o7 o7Var4;
        int i16;
        int i17;
        int i18;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i19;
        int i20;
        z2 z2Var = this.x;
        y2 y2Var = z2Var.x1;
        boolean z12 = this.h;
        Context context = this.r;
        o7 o7Var5 = this.e;
        org.telegram.ui.ActionBar.p6 p6Var4 = this.d;
        if (z12 || y2Var.b != null) {
            TL_stories.StoryItem storyItem5 = y2Var.a;
            if (y2Var.b != null) {
                storyItem = storyItem5;
                p6Var = p6Var4;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, cd.L0(2131752589, null), false, this.d).setOnClickListener(new l2(this, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                storyItem = storyItem5;
                p6Var = p6Var4;
            }
            if (storyItem == null) {
                return;
            }
            if (!(z2Var.l1 || z2Var.B1.h(z2Var.k1)) || y2Var.f || (storyItem2 = y2Var.a) == null) {
                i10 = R.id.fit_width_tag;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                z60 z60Var = new z60(actionBarPopupWindow$ActionBarPopupWindowLayout2, p6Var);
                z60Var.c(R.drawable.ic_ab_back, cd.L0(2131753756, null), new sg.v(actionBarPopupWindow$ActionBarPopupWindowLayout2, 8), false);
                z60Var.k();
                t4 B = z2Var.getStoriesController().B(z2Var.k1, true);
                t4 B2 = z2Var.B1.B(z2Var.k1, false);
                z60.f(z60Var, B, hashSet, B2 != null && B2.a(), new rh.l5(this, p6Var, storyItem2, 4), new ag.m2(this, hashSet, storyItem2, p6Var, 19));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(z60Var.B);
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, z2Var.getContext(), this.d, false, false);
                z2Var.n3 = b1Var;
                b1Var.j(cd.L0(2131744823, null), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.b1 b1Var2 = z2Var.n3;
                b1Var2.P = new p2(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                b1Var2.setOnClickListener(new l2(this, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(z2Var.n3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, z2Var.getContext(), p6Var);
                i10 = R.id.fit_width_tag;
                h1Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(h1Var, w7.b6.o(-1, 8));
            }
            if (z2Var.l1) {
                vh.u6 u6Var = storyItem.privacy.isEmpty() ? new vh.u6(3, z2Var.l2, new ArrayList()) : new vh.u6(z2Var.l2, storyItem.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, cd.L0(2131742904, null), false, this.d);
                c10.setSubtext(u6Var.toString());
                c10.setOnClickListener(new rh.e7(this, u6Var, storyItem, 3));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            s(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (z2Var.l1 || this.f) {
                org.telegram.ui.ActionBar.h1 h1Var2 = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, z2Var.getContext(), p6Var);
                h1Var2.setTag(i10, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(h1Var2, w7.b6.o(-1, 8));
            }
            if (z2Var.L2 || y2Var.f || !((z2Var.G0() || vp.r1(z2Var.l2).T4()) && this.n)) {
                o7Var = o7Var5;
                u2Var = this;
            } else {
                org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, cd.L0(z2Var.G0() ? 2131751289 : 2131751221, null), false, this.d);
                z2Var.b1 = c11;
                u2Var = this;
                o7Var = o7Var5;
                c11.setOnClickListener(new bi.c(this, this.d, this.r, o7Var5, this.s, 14));
                if (z2Var.B1.M(z2Var.k1) && y2Var.e && !tz.b()) {
                    z2Var.b1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem6 = y2Var.a;
            if (storyItem6 != null && y2Var.e && !y2Var.f && (storyItem6.pinned || z2Var.H0())) {
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, cd.L0(2131744692, null), false, u2Var.d).setOnClickListener(new bi.c(u2Var, u2Var.r, storyItem, o7Var, u2Var.s, 15));
            }
            if ((z2Var.l1 || (z2Var.m1 && vp.r1(z2Var.l2).O1().h(storyItem.dialogId))) && !y2Var.f) {
                boolean z13 = storyItem.pinned;
                boolean z14 = !z13;
                if (z2Var.l1) {
                    if (z13) {
                        str = null;
                        i11 = 2131754137;
                    } else {
                        i11 = 2131745926;
                        str = null;
                    }
                    L0 = cd.L0(i11, str);
                } else {
                    L0 = cd.L0(!z13 ? 2131745927 : 2131746327, null);
                }
                o7Var2 = o7Var;
                org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z13 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, L0, false, u2Var.d);
                org.telegram.ui.ActionBar.p6 p6Var5 = p6Var;
                u2 u2Var4 = u2Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                kg.z0 z0Var = new kg.z0(u2Var4, storyItem, z14, p6Var5, 5);
                u2Var2 = u2Var4;
                p6Var2 = p6Var5;
                c12.setOnClickListener(z0Var);
            } else {
                u2Var2 = u2Var;
                o7Var2 = o7Var;
                p6Var2 = p6Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            u2Var2.t(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (z2Var.L2 || y2Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                if (y2Var.e) {
                    i14 = 2131745925;
                    str3 = null;
                } else {
                    str3 = null;
                    i14 = 2131745956;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, cd.L0(i14, str3), false, u2Var2.d).setOnClickListener(new l2(u2Var2, 7));
            }
            if (!vp.r1(z2Var.l2).A3() && !y2Var.f && !z2Var.m1) {
                z2.Z(z2Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (z2Var.m1 && z2Var.D2) {
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, cd.L0(2131751762, null), false, u2Var2.d).setOnClickListener(new l2(u2Var2, 8));
            }
            if (z2Var.D2) {
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, cd.L0(2131752982, null), false, u2Var2.d).setOnClickListener(new l2(u2Var2, 9));
            }
            TL_stories.StoryItem storyItem7 = y2Var.a;
            if (storyItem7 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem7.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (s0Var2 = s0.W) != null && s0Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    s0 s0Var3 = s0.W;
                    boolean z15 = s0Var3 != null && s0Var3.o();
                    int i21 = z15 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted;
                    if (z15) {
                        i13 = 2131743874;
                        str2 = null;
                    } else {
                        str2 = null;
                        i13 = 2131748329;
                    }
                    org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i21, cd.L0(i13, str2), false, u2Var2.d).setOnClickListener(new org.telegram.ui.ActionBar.c0(7, u2Var2, z15));
                    org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, cd.L0(2131754752, str2), false, u2Var2.d).setOnClickListener(new l2(u2Var2, 10));
                }
            }
            if (y2Var.f) {
                final int i22 = 1;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, cd.L0(2131747238, null), false, u2Var2.d).setOnClickListener(new View.OnClickListener(u2Var2) { // from class: th.m2
                    public final /* synthetic */ u2 b;

                    {
                        this.b = u2Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                u2 u2Var5 = this.b.x.c1;
                                if (u2Var5 != null) {
                                    u2Var5.a();
                                }
                                o7Var2.b0();
                                break;
                            default:
                                u2 u2Var6 = this.b.x.c1;
                                if (u2Var6 != null) {
                                    u2Var6.a();
                                }
                                o7Var2.b0();
                                break;
                        }
                    }
                });
            }
            if (y2Var.f && (z2Var.k1 == d20.i(z2Var.l2).e() || org.telegram.messenger.w3.w(14, vp.r1(z2Var.l2).L0(Long.valueOf(-z2Var.k1))) || ((s0Var = o7Var2.A0) != null && y2Var.k(s0Var.g()) && (groupCall = o7Var2.A0.w) != null && groupCall.creator))) {
                i12 = 1;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, cd.L0(2131748800, null), false, u2Var2.d).setOnClickListener(new n2(u2Var2, p6Var2, o7Var2, i12));
            } else {
                i12 = 1;
            }
            if (y2Var.f) {
                org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, cd.L0(2131748830, null), false, u2Var2.d);
                int i23 = org.telegram.ui.ActionBar.t6.q7;
                c13.h(0.12f, i23);
                c13.d(p6Var2.h(i23), p6Var2.h(i23));
                c13.setOnClickListener(new n2(u2Var2, p6Var2, o7Var2, 2));
            }
            if (!y2Var.f) {
                if (!z2Var.l1) {
                    e5 O1 = vp.r1(z2Var.l2).O1();
                    TL_stories.StoryItem storyItem8 = y2Var.a;
                    int i24 = O1.a;
                    if (storyItem8 != null) {
                        if (storyItem8.dialogId != d20.i(i24).e()) {
                            if (storyItem8.dialogId > 0) {
                                TLRPC.User Z1 = vp.r1(i24).Z1(Long.valueOf(storyItem8.dialogId));
                                if (Z1 != null) {
                                    if (Z1.bot) {
                                    }
                                }
                            }
                            if (storyItem8.dialogId < 0) {
                                TLRPC.Chat L03 = vp.r1(i24).L0(Long.valueOf(-storyItem8.dialogId));
                                if (L03 != null) {
                                    if (!L03.creator) {
                                        boolean z16 = storyItem8.out;
                                        if (z16) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = L03.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z16) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = L03.admin_rights;
                                            if (tL_chatAdminRights2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList = null;
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, cd.L0(2131751599, null), false, u2Var2.d);
                int i25 = org.telegram.ui.ActionBar.t6.q7;
                c14.h(0.12f, i25);
                c14.d(p6Var2.h(i25), p6Var2.h(i25));
                c14.setOnClickListener(new l2(u2Var2, 13));
                z10 = (y2Var != null || (storyItem3 = y2Var.a) == null || (messageMedia = storyItem3.media) == null || (!jj.V2(messageMedia.document) && ((photo = y2Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : i12;
                if (y2Var == null) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    TL_stories.StoryItem storyItem9 = y2Var.a;
                    if (storyItem9 != null && storyItem9.media_areas != null) {
                        for (int i26 = 0; i26 < y2Var.a.media_areas.size(); i26++) {
                            TL_stories.MediaArea mediaArea2 = y2Var.a.media_areas.get(i26);
                            if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TLRPC.Reaction reaction = mediaArea2.reaction;
                                if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e = org.telegram.ui.Components.f5.e(z2Var.l2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                                    if (e != null && (j13 = jj.j1(e)) != null && !hashSet2.contains(Long.valueOf(j13.id))) {
                                        hashSet2.add(Long.valueOf(j13.id));
                                        arrayList4.add(j13);
                                    }
                                }
                            }
                        }
                    }
                    TL_stories.StoryItem storyItem10 = y2Var.a;
                    if (storyItem10 == null || (arrayList3 = storyItem10.entities) == null || arrayList3.isEmpty()) {
                        d5 d5Var = y2Var.b;
                        if (d5Var != null && (n5Var = d5Var.c) != null) {
                            if (n5Var.T0 != null) {
                                for (int i27 = 0; i27 < y2Var.b.c.T0.size(); i27++) {
                                    v20 v20Var = (v20) y2Var.b.c.T0.get(i27);
                                    if (v20Var.a == 4 && (mediaArea = v20Var.M) != null) {
                                        TLRPC.Reaction reaction2 = mediaArea.reaction;
                                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                            TLRPC.Document e7 = org.telegram.ui.Components.f5.e(z2Var.l2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                            if (e7 != null && (j12 = jj.j1(e7)) != null && !hashSet2.contains(Long.valueOf(j12.id))) {
                                                hashSet2.add(Long.valueOf(j12.id));
                                                arrayList4.add(j12);
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence = y2Var.b.c.C0;
                            if (charSequence instanceof Spanned) {
                                z11 = false;
                                org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.o5.class);
                                if (o5VarArr != null) {
                                    for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                                        TLRPC.Document document = o5Var.document;
                                        if (document == null) {
                                            document = org.telegram.ui.Components.f5.e(z2Var.l2, o5Var.documentId);
                                        }
                                        if (document != null) {
                                            TLRPC.InputStickerSet j14 = jj.j1(document);
                                            if (!hashSet2.contains(Long.valueOf(j14.id))) {
                                                hashSet2.add(Long.valueOf(j14.id));
                                                arrayList4.add(j14);
                                            }
                                        }
                                    }
                                }
                                arrayList2 = arrayList4;
                            }
                        }
                    } else {
                        for (int i28 = 0; i28 < y2Var.a.entities.size(); i28++) {
                            TLRPC.MessageEntity messageEntity = y2Var.a.entities.get(i28);
                            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                                if (document2 == null) {
                                    document2 = org.telegram.ui.Components.f5.e(z2Var.l2, tL_messageEntityCustomEmoji.document_id);
                                }
                                if (document2 != null) {
                                    TLRPC.InputStickerSet j15 = jj.j1(document2);
                                    if (!hashSet2.contains(Long.valueOf(j15.id))) {
                                        hashSet2.add(Long.valueOf(j15.id));
                                        arrayList4.add(j15);
                                    }
                                }
                            }
                        }
                    }
                    z11 = false;
                    arrayList2 = arrayList4;
                } else {
                    z11 = false;
                    arrayList2 = arrayList;
                }
                boolean z17 = (arrayList2 != null || arrayList2.isEmpty()) ? z11 : true;
                if (z10 == 0 || z17) {
                    org.telegram.ui.ActionBar.h1 h1Var3 = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, context, p6Var2);
                    h1Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(h1Var3, w7.b6.o(-1, 8));
                    TLRPC.MessageMedia messageMedia3 = y2Var.a.media;
                    tLObject = messageMedia3.document;
                    if (tLObject == null) {
                        tLObject = messageMedia3.photo;
                    }
                    l6 l6Var = new l6(this.r, z2Var.l2, tLObject, y2Var.a, z10, arrayList2, this.d);
                    l6Var.setOnClickListener(new rh.u1(7, this, l6Var));
                    l6Var.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(l6Var, w7.b6.o(-1, -2));
                }
                return;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            s(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String v = ot.v(z2Var.k1, 0L, false);
            boolean g02 = NotificationsCustomSettingsActivity.g0(z2Var.l2, z2Var.k1);
            if (z2Var.k1 > 0) {
                L02 = null;
                TLRPC.User Z12 = vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1));
                tLObject2 = Z12;
                user = Z12;
            } else {
                user = null;
                L02 = vp.r1(z2Var.l2).L0(Long.valueOf(-z2Var.k1));
                tLObject2 = L02;
            }
            String trim = user == null ? L02 == null ? "" : L02.title : h20.j(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str6 = trim;
            if (h20.A(z2Var.k1) || z2Var.G0()) {
                u2Var3 = this;
                str4 = null;
                o7Var3 = o7Var5;
                p6Var3 = p6Var4;
                i15 = 0;
            } else {
                if (g02) {
                    o7Var3 = o7Var5;
                    p6Var3 = p6Var4;
                    i15 = 0;
                    org.telegram.ui.ActionBar.b1 c15 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, cd.L0(2131747879, null), false, this.d);
                    final int i29 = 0;
                    final org.telegram.ui.ActionBar.p6 p6Var6 = this.d;
                    final TLObject tLObject3 = tLObject2;
                    u2Var3 = this;
                    c15.setOnClickListener(new View.OnClickListener(this) { // from class: th.s2
                        public final /* synthetic */ u2 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i30 = i29;
                            String str7 = str6;
                            TLObject tLObject4 = tLObject3;
                            org.telegram.ui.ActionBar.p6 p6Var7 = p6Var6;
                            String str8 = v;
                            u2 u2Var5 = this.b;
                            switch (i30) {
                                case 0:
                                    z2 z2Var2 = u2Var5.x;
                                    vp.r1(z2Var2.l2).e7.edit().putBoolean("stories_" + str8, false).apply();
                                    ot.t(z2Var2.l2).c0(z2Var2.k1, 0L, true);
                                    wb V = new cc(z2Var2.L0, p6Var7).V(Arrays.asList(tLObject4), org.telegram.messenger.i0.W2(cd.a0("NotificationsStoryMutedHint", null, 2131747878, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    u2 u2Var6 = z2Var2.c1;
                                    if (u2Var6 != null) {
                                        u2Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    z2 z2Var3 = u2Var5.x;
                                    vp.r1(z2Var3.l2).e7.edit().putBoolean("stories_" + str8, true).apply();
                                    ot.t(z2Var3.l2).c0(z2Var3.k1, 0L, true);
                                    wb V2 = new cc(z2Var3.L0, p6Var7).V(Arrays.asList(tLObject4), org.telegram.messenger.i0.W2(cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    u2 u2Var7 = z2Var3.c1;
                                    if (u2Var7 != null) {
                                        u2Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                } else {
                    u2Var3 = this;
                    o7Var3 = o7Var5;
                    p6Var3 = p6Var4;
                    final TLObject tLObject4 = tLObject2;
                    i15 = 0;
                    org.telegram.ui.ActionBar.b1 c16 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, cd.L0(2131747876, null), false, u2Var3.d);
                    final int i30 = 1;
                    final org.telegram.ui.ActionBar.p6 p6Var7 = u2Var3.d;
                    c16.setOnClickListener(new View.OnClickListener(u2Var3) { // from class: th.s2
                        public final /* synthetic */ u2 b;

                        {
                            this.b = u2Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i302 = i30;
                            String str7 = str6;
                            TLObject tLObject42 = tLObject4;
                            org.telegram.ui.ActionBar.p6 p6Var72 = p6Var7;
                            String str8 = v;
                            u2 u2Var5 = this.b;
                            switch (i302) {
                                case 0:
                                    z2 z2Var2 = u2Var5.x;
                                    vp.r1(z2Var2.l2).e7.edit().putBoolean("stories_" + str8, false).apply();
                                    ot.t(z2Var2.l2).c0(z2Var2.k1, 0L, true);
                                    wb V = new cc(z2Var2.L0, p6Var72).V(Arrays.asList(tLObject42), org.telegram.messenger.i0.W2(cd.a0("NotificationsStoryMutedHint", null, 2131747878, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    u2 u2Var6 = z2Var2.c1;
                                    if (u2Var6 != null) {
                                        u2Var6.a();
                                        break;
                                    }
                                    break;
                                default:
                                    z2 z2Var3 = u2Var5.x;
                                    vp.r1(z2Var3.l2).e7.edit().putBoolean("stories_" + str8, true).apply();
                                    ot.t(z2Var3.l2).c0(z2Var3.k1, 0L, true);
                                    wb V2 = new cc(z2Var3.L0, p6Var72).V(Arrays.asList(tLObject42), org.telegram.messenger.i0.W2(cd.a0("NotificationsStoryUnmutedHint", null, 2131747875, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    u2 u2Var7 = z2Var3.c1;
                                    if (u2Var7 != null) {
                                        u2Var7.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c16.setMultiline(false);
                }
                ui.b0(z2Var.l2).M0(true);
                int i31 = (user == null || user.contact || !ui.b0(z2Var.l2).G(z2Var.k1)) ? i15 : 1;
                if (z2Var.k1 > 0) {
                    i19 = (user == null || !user.contact) ? i15 : 1;
                    if (user != null) {
                    }
                    i20 = i15;
                } else {
                    i19 = (L02 == null || org.telegram.messenger.w3.r0(L02)) ? i15 : 1;
                    if (L02 != null) {
                    }
                    i20 = i15;
                }
                if (i31 != 0) {
                    str4 = null;
                    org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, cd.L0(2131744766, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, 14));
                } else {
                    str4 = null;
                    if (i19 != 0) {
                        if (i20 == 0) {
                            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, cd.L0(2131754153, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, 15));
                        } else {
                            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, cd.L0(2131743939, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, i15));
                        }
                    }
                }
            }
            if (y2Var.f) {
                o7Var4 = o7Var3;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, cd.L0(2131747238, str4), false, u2Var3.d).setOnClickListener(new View.OnClickListener(u2Var3) { // from class: th.m2
                    public final /* synthetic */ u2 b;

                    {
                        this.b = u2Var3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                u2 u2Var5 = this.b.x.c1;
                                if (u2Var5 != null) {
                                    u2Var5.a();
                                }
                                o7Var4.b0();
                                break;
                            default:
                                u2 u2Var6 = this.b.x.c1;
                                if (u2Var6 != null) {
                                    u2Var6.a();
                                }
                                o7Var4.b0();
                                break;
                        }
                    }
                });
            } else {
                o7Var4 = o7Var3;
            }
            if (vp.r1(z2Var.l2).A3() || !y2Var.e) {
                i16 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z18 = vp.r1(z2Var.l2).q6;
                if (d20.i(z2Var.l2).q()) {
                    int i32 = z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd;
                    String L04 = cd.L0(z18 ? 2131744538 : 2131744535, str4);
                    org.telegram.ui.ActionBar.p6 p6Var8 = z2Var.k0;
                    i16 = R.drawable.msg_gallery_locked2;
                    org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i32, L04, false, p6Var8).setOnClickListener(new org.telegram.ui.ActionBar.c0(6, z2Var, z18));
                } else {
                    i16 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = z2Var.getContext().getDrawable(i16);
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    zw0 zw0Var = new zw0(z2Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 3);
                    int L = org.telegram.messenger.i0.L(24.0f);
                    int L2 = org.telegram.messenger.i0.L(24.0f);
                    zw0Var.e = L;
                    zw0Var.f = L2;
                    int L3 = org.telegram.messenger.i0.L(1.0f);
                    int i33 = -org.telegram.messenger.i0.L(2.0f);
                    zw0Var.s = L3;
                    zw0Var.w = i33;
                    org.telegram.ui.ActionBar.b1 c17 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, cd.L0(2131744535, null), false, z2Var.k0);
                    i17 = 7;
                    c17.setOnClickListener(new k1(z2Var, i17));
                    c17.setIcon(zw0Var);
                    if (z2Var.L2 && z2Var.B2 && !y2Var.f) {
                        if (d20.i(z2Var.l2).q()) {
                            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, cd.L0(2131745946, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, 1));
                        } else if (!vp.r1(z2Var.l2).A3()) {
                            Drawable drawable2 = context.getDrawable(i16);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                            i18 = 4;
                            zw0 zw0Var2 = new zw0(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 4);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.b1 c18 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, cd.L0(2131745946, null), false, u2Var3.d);
                            c18.setIcon(zw0Var2);
                            c18.setOnClickListener(new rh.e7(u2Var3, c18, o7Var4, i18));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        i18 = 4;
                    } else {
                        i18 = 4;
                        actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    }
                    if (!vp.r1(z2Var.l2).A3() && !z2Var.m1) {
                        z2.Z(z2Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (z2Var.D2) {
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, cd.L0(2131751762, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, 2));
                    }
                    if (z2Var.D2) {
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, cd.L0(2131752982, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, 3));
                    }
                    storyItem4 = y2Var.a;
                    if (storyItem4 != null) {
                        if (storyItem4.translated && TextUtils.equals(storyItem4.translatedLng, m31.M0())) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, cd.L0(2131749313, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, i18));
                        } else {
                            t10 t10Var = vp.r1(z2Var.l2).t7;
                            TL_stories.StoryItem storyItem11 = y2Var.a;
                            t10Var.getClass();
                            if (storyItem11 != null && !TextUtils.isEmpty(storyItem11.caption) && !org.telegram.messenger.k6.d(storyItem11.caption) && ((storyItem11.detectedLng == null && storyItem11.translatedText != null && TextUtils.equals(storyItem11.translatedLng, m31.M0())) || ((str5 = storyItem11.detectedLng) != null && !t10Var.w(str5)))) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, cd.L0(2131743981, null), false, u2Var3.d).setOnClickListener(new l2(u2Var3, 5));
                            }
                        }
                        u2Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, y2Var.a);
                        if (!z2Var.L2 || h20.A(z2Var.k1) || z2Var.G0()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            p6Var2 = p6Var3;
                        } else {
                            org.telegram.ui.ActionBar.p6 p6Var9 = p6Var3;
                            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, cd.L0(2131746247, null), false, u2Var3.d).setOnClickListener(new n2(u2Var3, o7Var4, p6Var9));
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            p6Var2 = p6Var9;
                        }
                        i12 = 1;
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    u2Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, y2Var.a);
                    if (z2Var.L2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    p6Var2 = p6Var3;
                    i12 = 1;
                }
            }
            i17 = 7;
            if (z2Var.L2) {
            }
            i18 = 4;
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!vp.r1(z2Var.l2).A3()) {
                z2.Z(z2Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
            }
            if (z2Var.D2) {
            }
            if (z2Var.D2) {
            }
            storyItem4 = y2Var.a;
            if (storyItem4 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            u2Var3.t(actionBarPopupWindow$ActionBarPopupWindowLayout8, y2Var.a);
            if (z2Var.L2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            p6Var2 = p6Var3;
            i12 = 1;
        }
        arrayList = null;
        if (y2Var != null) {
        }
        if (y2Var == null) {
        }
        if (arrayList2 != null) {
        }
        if (z10 == 0) {
        }
        org.telegram.ui.ActionBar.h1 h1Var32 = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, context, p6Var2);
        h1Var32.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(h1Var32, w7.b6.o(-1, 8));
        TLRPC.MessageMedia messageMedia32 = y2Var.a.media;
        tLObject = messageMedia32.document;
        if (tLObject == null) {
        }
        l6 l6Var2 = new l6(this.r, z2Var.l2, tLObject, y2Var.a, z10, arrayList2, this.d);
        l6Var2.setOnClickListener(new rh.u1(7, this, l6Var2));
        l6Var2.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(l6Var2, w7.b6.o(-1, -2));
    }

    @Override // k.a
    public final void k() {
        if (!this.c && !this.w[0]) {
            org.telegram.messenger.i0.g3(new o2(this, 0));
        }
        z2 z2Var = this.x;
        z2Var.c1 = null;
        z2Var.b1 = null;
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        y2 y2Var;
        boolean z11 = this.f;
        z2 z2Var = this.x;
        if (!z11 || ((y2Var = z2Var.x1) != null && y2Var.b != null)) {
            z2Var.l3 = null;
            z2Var.m3 = null;
            return;
        }
        Context context = z2Var.getContext();
        yf0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final m4.c cVar = new m4.c(29, this, actionBarPopupWindow$ActionBarPopupWindowLayout);
        li.k kVar = new li.k(19, false);
        org.telegram.ui.ActionBar.b1[] b1VarArr = new org.telegram.ui.ActionBar.b1[5];
        kVar.d = b1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        kVar.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, cd.L0(2131753756, null), false, null);
        c10.setOnClickListener(new sr(swipeBack, 1));
        c10.d(-328966, -328966);
        c10.setSelectorColor(268435455);
        View a5Var = new org.telegram.ui.Cells.a5(context, 15);
        a5Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        a5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a5Var.getLayoutParams();
        if (cd.X) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.i0.L(8.0f);
        a5Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.x0 x0Var = new org.telegram.ui.ActionBar.x0(context, null);
        kVar.c = x0Var;
        x0Var.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        x0Var.setDrawShadow(false);
        x0Var.setBackgroundColor(-14540254);
        x0Var.setTextColor(-1);
        x0Var.setOnValueChange(new org.telegram.ui.z4(cVar, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(x0Var, w7.b6.o(-1, 44));
        View a5Var2 = new org.telegram.ui.Cells.a5(context, 16);
        a5Var2.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        a5Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a5Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a5Var2.getLayoutParams();
        if (cd.X) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = org.telegram.messenger.i0.L(8.0f);
        a5Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, cd.L0(2131745281, null), false, null);
        c11.d(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        cVar.X(true, true, 0.2f);
                        break;
                    case 1:
                        cVar.X(true, true, 0.5f);
                        break;
                    case 2:
                        cVar.X(true, true, 1.0f);
                        break;
                    case 3:
                        cVar.X(true, true, 1.5f);
                        break;
                    default:
                        cVar.X(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        b1VarArr[0] = c11;
        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, cd.L0(2131745284, null), false, null);
        c12.d(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        cVar.X(true, true, 0.2f);
                        break;
                    case 1:
                        cVar.X(true, true, 0.5f);
                        break;
                    case 2:
                        cVar.X(true, true, 1.0f);
                        break;
                    case 3:
                        cVar.X(true, true, 1.5f);
                        break;
                    default:
                        cVar.X(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        b1VarArr[1] = c12;
        org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, cd.L0(2131745285, null), false, null);
        c13.d(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        cVar.X(true, true, 0.2f);
                        break;
                    case 1:
                        cVar.X(true, true, 0.5f);
                        break;
                    case 2:
                        cVar.X(true, true, 1.0f);
                        break;
                    case 3:
                        cVar.X(true, true, 1.5f);
                        break;
                    default:
                        cVar.X(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        b1VarArr[2] = c13;
        org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, cd.L0(2131745288, null), false, null);
        c14.d(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        cVar.X(true, true, 0.2f);
                        break;
                    case 1:
                        cVar.X(true, true, 0.5f);
                        break;
                    case 2:
                        cVar.X(true, true, 1.0f);
                        break;
                    case 3:
                        cVar.X(true, true, 1.5f);
                        break;
                    default:
                        cVar.X(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        b1VarArr[3] = c14;
        org.telegram.ui.ActionBar.b1 c15 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, cd.L0(2131745282, null), false, null);
        c15.d(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        cVar.X(true, true, 0.2f);
                        break;
                    case 1:
                        cVar.X(true, true, 0.5f);
                        break;
                    case 2:
                        cVar.X(true, true, 1.0f);
                        break;
                    case 3:
                        cVar.X(true, true, 1.5f);
                        break;
                    default:
                        cVar.X(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        b1VarArr[4] = c15;
        z2Var.l3 = kVar;
        kVar.L(true, o7.B1);
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, z2Var.getContext(), this.d, false, false);
        z2Var.m3 = b1Var;
        b1Var.j(cd.L0(2131745289, null), R.drawable.msg_speed, null);
        z2.Y(z2Var, true);
        z2Var.m3.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        z2Var.m3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z2Var.m3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) z2Var.m3.getLayoutParams();
        if (cd.X) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = org.telegram.messenger.i0.L(48.0f);
        z2Var.m3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) z2Var.l3.b);
        org.telegram.ui.ActionBar.b1 b1Var2 = z2Var.m3;
        b1Var2.P = new p2(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        b1Var2.setOnClickListener(new l2(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, z2Var.getContext(), this.d);
            h1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var, w7.b6.o(-1, 8));
        }
    }

    public final void t(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat L0;
        z2 z2Var = this.x;
        if (!z2Var.m1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (L0 = vp.r1(z2Var.l2).L0(Long.valueOf(-z2Var.k1))) == null) {
            return;
        }
        TLRPC.ChatFull M0 = vp.r1(z2Var.l2).M0(L0.id);
        if (M0 == null) {
            M0 = hs.a0(z2Var.l2).F0(L0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (M0 == null || !M0.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, cd.L0(2131743568, null), false, this.d).setOnClickListener(new org.telegram.messenger.video.h(this, storyItem, this.e, L0, 13));
    }
}
