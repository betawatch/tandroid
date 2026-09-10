package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import bi.pb;
import bi.r9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.cs;
import org.telegram.ui.i01;
import org.telegram.ui.ou;
import org.telegram.ui.xr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v2 extends ds {
    public boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ u7 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ y2 j;
    public final /* synthetic */ boolean[] k;
    public final /* synthetic */ a3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(a3 a3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f6 f6Var2, u7 u7Var, boolean z10, boolean z11, boolean z12, Context context2, y2 y2Var, boolean[] zArr) {
        super(context, f6Var, true);
        this.l = a3Var;
        this.d = f6Var2;
        this.e = u7Var;
        this.f = z10;
        this.g = z11;
        this.h = z12;
        this.i = context2;
        this.j = y2Var;
        this.k = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0150, code lost:
    
        if (r7.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        if (r15.stories_hidden != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08ac, code lost:
    
        if (r2.bot_can_edit == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x08da, code lost:
    
        if (r2.delete_stories == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x08e5, code lost:
    
        if (r0.delete_stories == false) goto L343;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03da  */
    /* JADX WARN: Type inference failed for: r4v92, types: [org.telegram.tgnet.TLRPC$User] */
    @Override // org.telegram.ui.Components.ds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        org.telegram.ui.ActionBar.f6 f6Var;
        final v2 v2Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        u7 u7Var;
        u7 u7Var2;
        final u7 u7Var3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        t0 t0Var;
        TLRPC.GroupCall groupCall;
        t0 t0Var2;
        Integer num;
        ArrayList arrayList;
        r9 r9Var;
        org.telegram.ui.Components.y5[] y5VarArr;
        Integer num2;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.InputStickerSet inputStickerSet2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user;
        org.telegram.ui.ActionBar.f6 f6Var2;
        u7 u7Var4;
        final u7 u7Var5;
        int i10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        TL_stories.StoryItem storyItem3;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        boolean z10;
        boolean z11;
        Integer num3 = 1;
        a3 a3Var = this.l;
        z2 z2Var = a3Var.O1;
        boolean z12 = this.g;
        Context context = this.i;
        u7 u7Var6 = this.e;
        org.telegram.ui.ActionBar.f6 f6Var3 = this.d;
        if (z12 || z2Var.b != null) {
            f6Var = f6Var3;
            v2Var = this;
            TL_stories.StoryItem storyItem4 = z2Var.a;
            if (z2Var.b != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, v2Var.d).setOnClickListener(new m2(v2Var, 6));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem4 == null) {
                return;
            }
            if ((a3Var.C1 || a3Var.S1.h(a3Var.B1)) && !z2Var.f && (storyItem = z2Var.a) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                w70 w70Var = new w70(actionBarPopupWindow$ActionBarPopupWindowLayout2, f6Var);
                w70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new xh.x(actionBarPopupWindow$ActionBarPopupWindowLayout2, 24), false);
                w70Var.k();
                w4 B = a3Var.getStoriesController().B(a3Var.B1, true);
                w4 B2 = a3Var.S1.B(a3Var.B1, false);
                w70.f(w70Var, B, hashSet, B2 != null && B2.a(), new xh.n1(v2Var, f6Var, storyItem, 11), new gg.u1(v2Var, hashSet, storyItem, f6Var, 17));
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(w70Var.B);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, a3Var.getContext(), v2Var.d, false, false);
                a3Var.E3 = g1Var;
                g1Var.g(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                org.telegram.ui.ActionBar.g1 g1Var2 = a3Var.E3;
                g1Var2.G = new q2(actionBarPopupWindow$ActionBarPopupWindowLayout2, b10, 1);
                g1Var2.setOnClickListener(new m2(v2Var, 12));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a3Var.E3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(a3Var.getContext(), org.telegram.ui.ActionBar.j6.H8, f6Var);
                m1Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(m1Var, w7.a6.n(-1, 8));
            }
            if (a3Var.C1) {
                pb pbVar = storyItem4.privacy.isEmpty() ? new pb(3, a3Var.C2, new ArrayList()) : new pb(a3Var.C2, storyItem4.privacy);
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, v2Var.d);
                c10.setSubtext(pbVar.toString());
                c10.setOnClickListener(new wh.r(v2Var, pbVar, storyItem4, 6));
                c10.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            v2Var.d(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (a3Var.C1 || v2Var.f) {
                org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(a3Var.getContext(), org.telegram.ui.ActionBar.j6.H8, f6Var);
                m1Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(m1Var2, w7.a6.n(-1, 8));
            }
            if (a3Var.c3 || z2Var.f || !((a3Var.I0() || MessagesController.getInstance(a3Var.C2).storiesEnabled()) && v2Var.h)) {
                u7Var = u7Var6;
            } else {
                org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, LocaleController.getString(a3Var.I0() ? R.string.EditBotPreview : R.string.EditStory), false, v2Var.d);
                a3Var.s1 = c11;
                u7Var = u7Var6;
                c11.setOnClickListener(new hi.c(v2Var, v2Var.d, v2Var.i, u7Var6, v2Var.j, 14));
                if (a3Var.S1.K(a3Var.B1) && z2Var.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    a3Var.s1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem5 = z2Var.a;
            if (storyItem5 == null || !z2Var.e || z2Var.f || !(storyItem5.pinned || a3Var.J0())) {
                u7Var2 = u7Var;
            } else {
                u7Var2 = u7Var;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, v2Var.d).setOnClickListener(new hi.c(v2Var, v2Var.i, storyItem4, u7Var2, v2Var.j, 15));
            }
            if ((a3Var.C1 || (a3Var.D1 && MessagesController.getInstance(a3Var.C2).getStoriesController().h(storyItem4.dialogId))) && !z2Var.f) {
                boolean z13 = storyItem4.pinned;
                boolean z14 = !z13;
                u7Var3 = u7Var2;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z13 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, a3Var.C1 ? LocaleController.getString(!z13 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z13 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, v2Var.d).setOnClickListener(new ou(v2Var, storyItem4, z14, f6Var, 5));
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                u7Var3 = u7Var2;
            }
            v2Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem4);
            if (a3Var.c3 || z2Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, LocaleController.getString(z2Var.e ? R.string.SaveVideo : R.string.SaveImage), false, v2Var.d).setOnClickListener(new m2(v2Var, 7));
            }
            if (!MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked() && !z2Var.f && !a3Var.D1) {
                a3.b0(a3Var, actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (a3Var.D1 && a3Var.U2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, v2Var.d).setOnClickListener(new m2(v2Var, 8));
            }
            if (a3Var.U2) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, v2Var.d).setOnClickListener(new m2(v2Var, 9));
            }
            TL_stories.StoryItem storyItem6 = z2Var.a;
            if (storyItem6 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (t0Var2 = t0.W) != null && t0Var2.f(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    t0 t0Var3 = t0.W;
                    boolean z15 = t0Var3 != null && t0Var3.o();
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z15 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z15 ? R.string.Unmute : R.string.Mute), false, v2Var.d).setOnClickListener(new org.telegram.ui.ActionBar.e0(8, v2Var, z15));
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, v2Var.d).setOnClickListener(new m2(v2Var, 10));
                }
            }
            if (z2Var.f) {
                final int i11 = 1;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, v2Var.d).setOnClickListener(new View.OnClickListener(v2Var) { // from class: zh.n2
                    public final /* synthetic */ v2 b;

                    {
                        this.b = v2Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                v2 v2Var2 = this.b.l.t1;
                                if (v2Var2 != null) {
                                    v2Var2.a();
                                }
                                u7Var3.N();
                                break;
                            default:
                                v2 v2Var3 = this.b.l.t1;
                                if (v2Var3 != null) {
                                    v2Var3.a();
                                }
                                u7Var3.N();
                                break;
                        }
                    }
                });
            }
            if (z2Var.f && (a3Var.B1 == UserConfig.getInstance(a3Var.C2).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1))) || ((t0Var = u7Var3.A0) != null && z2Var.k(t0Var.g()) && (groupCall = u7Var3.A0.v) != null && groupCall.creator))) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, v2Var.d).setOnClickListener(new o2(v2Var, f6Var, u7Var3, 1));
            }
            if (z2Var.f) {
                org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, v2Var.d);
                int i12 = org.telegram.ui.ActionBar.j6.q7;
                c12.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)));
                c12.c(f6Var.F0(i12), f6Var.F0(i12));
                c12.setOnClickListener(new o2(v2Var, f6Var, u7Var3, 2));
            }
            if (!z2Var.f) {
                if (!a3Var.C1) {
                    i5 storiesController = MessagesController.getInstance(a3Var.C2).getStoriesController();
                    TL_stories.StoryItem storyItem7 = z2Var.a;
                    int i13 = storiesController.a;
                    if (storyItem7 != null) {
                        if (storyItem7.dialogId != UserConfig.getInstance(i13).getClientUserId()) {
                            if (storyItem7.dialogId > 0) {
                                TLRPC.User user3 = MessagesController.getInstance(i13).getUser(Long.valueOf(storyItem7.dialogId));
                                if (user3 != null) {
                                    if (user3.bot) {
                                    }
                                }
                            }
                            if (storyItem7.dialogId < 0) {
                                TLRPC.Chat chat4 = MessagesController.getInstance(i13).getChat(Long.valueOf(-storyItem7.dialogId));
                                if (chat4 != null) {
                                    if (!chat4.creator) {
                                        boolean z16 = storyItem7.out;
                                        if (z16) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat4.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z16) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat4.admin_rights;
                                            if (tL_chatAdminRights2 != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, v2Var.d);
                int i14 = org.telegram.ui.ActionBar.j6.q7;
                c13.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)));
                c13.c(f6Var.F0(i14), f6Var.F0(i14));
                c13.setOnClickListener(new m2(v2Var, 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            d(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String sharedPrefKey = NotificationsController.getSharedPrefKey(a3Var.B1, 0L);
            boolean c02 = NotificationsCustomSettingsActivity.c0(a3Var.C2, a3Var.B1);
            if (a3Var.B1 > 0) {
                ?? user4 = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1));
                chat2 = user4;
                chat = null;
                user = user4;
            } else {
                chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1));
                chat2 = chat;
                user = null;
            }
            String trim = user == null ? chat == null ? "" : chat.title : UserObject.getFirstName(user).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str = trim;
            if (UserObject.isService(a3Var.B1) || a3Var.I0()) {
                v2Var = this;
                f6Var2 = f6Var3;
                u7Var4 = u7Var6;
            } else {
                if (c02) {
                    user2 = user;
                    u7Var4 = u7Var6;
                    chat3 = chat;
                    f6Var2 = f6Var3;
                    org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, this.d);
                    final int i15 = 0;
                    final org.telegram.ui.ActionBar.f6 f6Var4 = this.d;
                    final TLRPC.Chat chat5 = chat2;
                    v2Var = this;
                    c14.setOnClickListener(new View.OnClickListener(this) { // from class: zh.t2
                        public final /* synthetic */ v2 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i15;
                            String str2 = str;
                            TLObject tLObject = chat5;
                            org.telegram.ui.ActionBar.f6 f6Var5 = f6Var4;
                            String str3 = sharedPrefKey;
                            v2 v2Var2 = this.b;
                            switch (i16) {
                                case 0:
                                    a3 a3Var2 = v2Var2.l;
                                    MessagesController.getNotificationsSettings(a3Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(a3Var2.C2).updateServerNotificationsSettings(a3Var2.B1, 0L);
                                    pc V = new wc(a3Var2.c1, f6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    v2 v2Var3 = a3Var2.t1;
                                    if (v2Var3 != null) {
                                        v2Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    a3 a3Var3 = v2Var2.l;
                                    MessagesController.getNotificationsSettings(a3Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(a3Var3.C2).updateServerNotificationsSettings(a3Var3.B1, 0L);
                                    pc V2 = new wc(a3Var3.c1, f6Var5).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    v2 v2Var4 = a3Var3.t1;
                                    if (v2Var4 != null) {
                                        v2Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c14.setMultiline(false);
                } else {
                    v2Var = this;
                    user2 = user;
                    chat3 = chat;
                    f6Var2 = f6Var3;
                    u7Var4 = u7Var6;
                    final TLRPC.Chat chat6 = chat2;
                    org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, v2Var.d);
                    final int i16 = 1;
                    final org.telegram.ui.ActionBar.f6 f6Var5 = v2Var.d;
                    c15.setOnClickListener(new View.OnClickListener(v2Var) { // from class: zh.t2
                        public final /* synthetic */ v2 b;

                        {
                            this.b = v2Var;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            String str2 = str;
                            TLObject tLObject = chat6;
                            org.telegram.ui.ActionBar.f6 f6Var52 = f6Var5;
                            String str3 = sharedPrefKey;
                            v2 v2Var2 = this.b;
                            switch (i162) {
                                case 0:
                                    a3 a3Var2 = v2Var2.l;
                                    MessagesController.getNotificationsSettings(a3Var2.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, false).apply();
                                    NotificationsController.getInstance(a3Var2.C2).updateServerNotificationsSettings(a3Var2.B1, 0L);
                                    pc V = new wc(a3Var2.c1, f6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2)), null, null);
                                    V.a = 2;
                                    V.j();
                                    v2 v2Var3 = a3Var2.t1;
                                    if (v2Var3 != null) {
                                        v2Var3.a();
                                        break;
                                    }
                                    break;
                                default:
                                    a3 a3Var3 = v2Var2.l;
                                    MessagesController.getNotificationsSettings(a3Var3.C2).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str3, true).apply();
                                    NotificationsController.getInstance(a3Var3.C2).updateServerNotificationsSettings(a3Var3.B1, 0L);
                                    pc V2 = new wc(a3Var3.c1, f6Var52).V(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    v2 v2Var4 = a3Var3.t1;
                                    if (v2Var4 != null) {
                                        v2Var4.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c15.setMultiline(false);
                }
                MediaDataController.getInstance(a3Var.C2).loadHints(true);
                boolean z17 = (user2 == null || user2.contact || !MediaDataController.getInstance(a3Var.C2).containsTopPeer(a3Var.B1)) ? false : true;
                if (a3Var.B1 > 0) {
                    z10 = user2 != null && user2.contact;
                    if (user2 != null) {
                    }
                    z11 = false;
                } else {
                    TLRPC.Chat chat7 = chat3;
                    z10 = (chat7 == null || ChatObject.isNotInChat(chat7)) ? false : true;
                    if (chat7 != null) {
                    }
                    z11 = false;
                }
                if (z17) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, v2Var.d).setOnClickListener(new m2(v2Var, 14));
                } else if (z10) {
                    if (z11) {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, v2Var.d).setOnClickListener(new m2(v2Var, 0));
                    } else {
                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, v2Var.d).setOnClickListener(new m2(v2Var, 15));
                    }
                }
            }
            if (z2Var.f) {
                final int i17 = 0;
                u7Var5 = u7Var4;
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, v2Var.d).setOnClickListener(new View.OnClickListener(v2Var) { // from class: zh.n2
                    public final /* synthetic */ v2 b;

                    {
                        this.b = v2Var;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                v2 v2Var2 = this.b.l.t1;
                                if (v2Var2 != null) {
                                    v2Var2.a();
                                }
                                u7Var5.N();
                                break;
                            default:
                                v2 v2Var3 = this.b.l.t1;
                                if (v2Var3 != null) {
                                    v2Var3.a();
                                }
                                u7Var5.N();
                                break;
                        }
                    }
                });
            } else {
                u7Var5 = u7Var4;
            }
            if (!MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked() && z2Var.e) {
                boolean z18 = MessagesController.getInstance(a3Var.C2).storyQualityFull;
                if (UserConfig.getInstance(a3Var.C2).isPremium()) {
                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z18 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z18 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, a3Var.B0).setOnClickListener(new org.telegram.ui.ActionBar.e0(7, a3Var, z18));
                } else {
                    Drawable drawable = a3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                    i10 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    i01 i01Var = new i01(a3Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 3);
                    int dp = AndroidUtilities.dp(24.0f);
                    int dp2 = AndroidUtilities.dp(24.0f);
                    i01Var.e = dp;
                    i01Var.f = dp2;
                    int dp3 = AndroidUtilities.dp(1.0f);
                    int i18 = -AndroidUtilities.dp(2.0f);
                    i01Var.s = dp3;
                    i01Var.v = i18;
                    org.telegram.ui.ActionBar.g1 c16 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, a3Var.B0);
                    c16.setOnClickListener(new l1(a3Var, 7));
                    c16.setIcon(i01Var);
                    if (!a3Var.c3 && a3Var.S2 && !z2Var.f) {
                        if (!UserConfig.getInstance(a3Var.C2).isPremium()) {
                            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, v2Var.d).setOnClickListener(new m2(v2Var, 1));
                        } else if (!MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked()) {
                            Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                            drawable2.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, i10, -16777216), PorterDuff.Mode.MULTIPLY));
                            i01 i01Var2 = new i01(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 4);
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            org.telegram.ui.ActionBar.g1 c17 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, v2Var.d);
                            c17.setIcon(i01Var2);
                            c17.setOnClickListener(new wh.r(v2Var, c17, u7Var5, 7));
                            if (!MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked() && !a3Var.D1) {
                                a3.b0(a3Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                            }
                            if (a3Var.U2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, v2Var.d).setOnClickListener(new m2(v2Var, 2));
                            }
                            if (a3Var.U2) {
                                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, v2Var.d).setOnClickListener(new m2(v2Var, 3));
                            }
                            storyItem3 = z2Var.a;
                            if (storyItem3 != null) {
                                if (storyItem3.translated && TextUtils.equals(storyItem3.translatedLng, i41.A())) {
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, v2Var.d).setOnClickListener(new m2(v2Var, 4));
                                } else if (MessagesController.getInstance(a3Var.C2).getTranslateController().canTranslateStory(z2Var.a)) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, v2Var.d).setOnClickListener(new m2(v2Var, 5));
                                    v2Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, z2Var.a);
                                    if (!a3Var.c3 || UserObject.isService(a3Var.B1) || a3Var.I0()) {
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                        f6Var = f6Var2;
                                    } else {
                                        f6Var = f6Var2;
                                        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, v2Var.d).setOnClickListener(new o2(v2Var, u7Var5, f6Var));
                                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    }
                                }
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            v2Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, z2Var.a);
                            if (a3Var.c3) {
                            }
                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            f6Var = f6Var2;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    if (!MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked()) {
                        a3.b0(a3Var, actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (a3Var.U2) {
                    }
                    if (a3Var.U2) {
                    }
                    storyItem3 = z2Var.a;
                    if (storyItem3 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    v2Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, z2Var.a);
                    if (a3Var.c3) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    f6Var = f6Var2;
                }
            }
            i10 = -1;
            if (!a3Var.c3) {
                if (!UserConfig.getInstance(a3Var.C2).isPremium()) {
                }
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (!MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked()) {
            }
            if (a3Var.U2) {
            }
            if (a3Var.U2) {
            }
            storyItem3 = z2Var.a;
            if (storyItem3 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            v2Var.e(actionBarPopupWindow$ActionBarPopupWindowLayout8, z2Var.a);
            if (a3Var.c3) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            f6Var = f6Var2;
        }
        boolean z19 = (z2Var == null || (storyItem2 = z2Var.a) == null || (messageMedia = storyItem2.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = z2Var.a.media.photo) == null || !photo.has_stickers))) ? false : true;
        if (z2Var != null) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            TL_stories.StoryItem storyItem8 = z2Var.a;
            if (storyItem8 != null && storyItem8.media_areas != null) {
                for (int i19 = 0; i19 < z2Var.a.media_areas.size(); i19++) {
                    TL_stories.MediaArea mediaArea2 = z2Var.a.media_areas.get(i19);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document f7 = org.telegram.ui.Components.p5.f(a3Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (f7 != null && (inputStickerSet2 = MessageObject.getInputStickerSet(f7)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                arrayList3.add(inputStickerSet2);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem9 = z2Var.a;
            if (storyItem9 == null || (arrayList2 = storyItem9.entities) == null || arrayList2.isEmpty()) {
                h5 h5Var = z2Var.b;
                if (h5Var != null && (r9Var = h5Var.c) != null) {
                    if (r9Var.T0 != null) {
                        for (int i20 = 0; i20 < z2Var.b.c.T0.size(); i20++) {
                            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) z2Var.b.c.T0.get(i20);
                            if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document f10 = org.telegram.ui.Components.p5.f(a3Var.C2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (f10 != null && (inputStickerSet = MessageObject.getInputStickerSet(f10)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                        hashSet2.add(Long.valueOf(inputStickerSet.id));
                                        arrayList3.add(inputStickerSet);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = z2Var.b.c.C0;
                    if ((charSequence instanceof Spanned) && (y5VarArr = (org.telegram.ui.Components.y5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)) != null) {
                        int i21 = 0;
                        while (i21 < y5VarArr.length) {
                            org.telegram.ui.Components.y5 y5Var = y5VarArr[i21];
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                num2 = num3;
                                document = org.telegram.ui.Components.p5.f(a3Var.C2, y5Var.documentId);
                            } else {
                                num2 = num3;
                            }
                            if (document != null) {
                                TLRPC.InputStickerSet inputStickerSet3 = MessageObject.getInputStickerSet(document);
                                if (!hashSet2.contains(Long.valueOf(inputStickerSet3.id))) {
                                    hashSet2.add(Long.valueOf(inputStickerSet3.id));
                                    arrayList3.add(inputStickerSet3);
                                }
                            }
                            i21++;
                            num3 = num2;
                        }
                    }
                }
            } else {
                for (int i22 = 0; i22 < z2Var.a.entities.size(); i22++) {
                    TLRPC.MessageEntity messageEntity = z2Var.a.entities.get(i22);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = org.telegram.ui.Components.p5.f(a3Var.C2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet inputStickerSet4 = MessageObject.getInputStickerSet(document2);
                            if (!hashSet2.contains(Long.valueOf(inputStickerSet4.id))) {
                                hashSet2.add(Long.valueOf(inputStickerSet4.id));
                                arrayList3.add(inputStickerSet4);
                            }
                        }
                    }
                }
            }
            num = num3;
            arrayList = arrayList3;
        } else {
            num = num3;
            arrayList = null;
        }
        boolean z20 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z19 || z20) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(context, org.telegram.ui.ActionBar.j6.H8, f6Var);
            m1Var3.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(m1Var3, w7.a6.n(-1, 8));
            TLRPC.MessageMedia messageMedia3 = z2Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            r6 r6Var = new r6(v2Var.i, a3Var.C2, tLObject, z2Var.a, z19, arrayList, v2Var.d);
            r6Var.setOnClickListener(new xh.s1(7, v2Var, r6Var));
            r6Var.setTag(R.id.fit_width_tag, num);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(r6Var, w7.a6.n(-1, -2));
        }
    }

    @Override // org.telegram.ui.Components.ds
    public final void c() {
        if (!this.c && !this.k[0]) {
            AndroidUtilities.runOnUIThread(new p2(this, 0));
        }
        a3 a3Var = this.l;
        a3Var.t1 = null;
        a3Var.s1 = null;
    }

    public final void d(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10) {
        z2 z2Var;
        boolean z11 = this.f;
        a3 a3Var = this.l;
        if (!z11 || ((z2Var = a3Var.O1) != null && z2Var.b != null)) {
            a3Var.C3 = null;
            a3Var.D3 = null;
            return;
        }
        Context context = a3Var.getContext();
        eh0 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final og.u0 u0Var = new og.u0(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, 27);
        cs csVar = new cs();
        org.telegram.ui.ActionBar.g1[] g1VarArr = new org.telegram.ui.ActionBar.g1[5];
        csVar.c = g1VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, context, null);
        csVar.a = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new xr(swipeBack, 1));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View l4Var = new bi.l4(context, 11);
        l4Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        l4Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l4Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) l4Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        l4Var.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(context, null);
        csVar.b = c1Var;
        c1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        c1Var.setDrawShadow(false);
        c1Var.setBackgroundColor(-14540254);
        c1Var.setTextColor(-1);
        c1Var.setOnValueChange(new org.telegram.ui.b5(u0Var, 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(c1Var, w7.a6.n(-1, 44));
        View l4Var2 = new bi.l4(context, 12);
        l4Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
        l4Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l4Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) l4Var2.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = AndroidUtilities.dp(8.0f);
        l4Var2.setLayoutParams(layoutParams2);
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c11.c(-328966, -328966);
        final int i10 = 0;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u0Var.q(true, true, 0.2f);
                        break;
                    case 1:
                        u0Var.q(true, true, 0.5f);
                        break;
                    case 2:
                        u0Var.q(true, true, 1.0f);
                        break;
                    case 3:
                        u0Var.q(true, true, 1.5f);
                        break;
                    default:
                        u0Var.q(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        g1VarArr[0] = c11;
        org.telegram.ui.ActionBar.g1 c12 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c12.c(-328966, -328966);
        final int i11 = 1;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        u0Var.q(true, true, 0.2f);
                        break;
                    case 1:
                        u0Var.q(true, true, 0.5f);
                        break;
                    case 2:
                        u0Var.q(true, true, 1.0f);
                        break;
                    case 3:
                        u0Var.q(true, true, 1.5f);
                        break;
                    default:
                        u0Var.q(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        g1VarArr[1] = c12;
        org.telegram.ui.ActionBar.g1 c13 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c13.c(-328966, -328966);
        final int i12 = 2;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        u0Var.q(true, true, 0.2f);
                        break;
                    case 1:
                        u0Var.q(true, true, 0.5f);
                        break;
                    case 2:
                        u0Var.q(true, true, 1.0f);
                        break;
                    case 3:
                        u0Var.q(true, true, 1.5f);
                        break;
                    default:
                        u0Var.q(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        g1VarArr[2] = c13;
        org.telegram.ui.ActionBar.g1 c14 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c14.c(-328966, -328966);
        final int i13 = 3;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        u0Var.q(true, true, 0.2f);
                        break;
                    case 1:
                        u0Var.q(true, true, 0.5f);
                        break;
                    case 2:
                        u0Var.q(true, true, 1.0f);
                        break;
                    case 3:
                        u0Var.q(true, true, 1.5f);
                        break;
                    default:
                        u0Var.q(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        g1VarArr[3] = c14;
        org.telegram.ui.ActionBar.g1 c15 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c15.c(-328966, -328966);
        final int i14 = 4;
        c15.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        u0Var.q(true, true, 0.2f);
                        break;
                    case 1:
                        u0Var.q(true, true, 0.5f);
                        break;
                    case 2:
                        u0Var.q(true, true, 1.0f);
                        break;
                    case 3:
                        u0Var.q(true, true, 1.5f);
                        break;
                    default:
                        u0Var.q(true, true, 2.0f);
                        break;
                }
            }
        });
        c15.setSelectorColor(268435455);
        g1VarArr[4] = c15;
        a3Var.C3 = csVar;
        csVar.a(u7.B1, true);
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, a3Var.getContext(), this.d, false, false);
        a3Var.D3 = g1Var;
        g1Var.g(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
        a3.a0(a3Var, true);
        a3Var.D3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        a3Var.D3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a3Var.D3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a3Var.D3.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = AndroidUtilities.dp(48.0f);
        a3Var.D3.setLayoutParams(layoutParams3);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(a3Var.C3.a);
        org.telegram.ui.ActionBar.g1 g1Var2 = a3Var.D3;
        g1Var2.G = new q2(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 0);
        g1Var2.setOnClickListener(new m2(this, 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z10) {
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(a3Var.getContext(), org.telegram.ui.ActionBar.j6.H8, this.d);
            m1Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, w7.a6.n(-1, 8));
        }
    }

    public final void e(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat chat;
        a3 a3Var = this.l;
        if (!a3Var.D1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-a3Var.B1))) == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(a3Var.C2).getChatFull(chat.id);
        if (chatFull == null) {
            chatFull = MessagesStorage.getInstance(a3Var.C2).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
        }
        if (chatFull == null || !chatFull.can_view_stats) {
            return;
        }
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.d).setOnClickListener(new di.o(this, storyItem, this.e, chat, 16));
    }
}
