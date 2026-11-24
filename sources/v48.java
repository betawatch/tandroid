// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v48 extends f9 {
    public boolean c;
    public final /* synthetic */ r63 d;
    public final /* synthetic */ oab e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ y48 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ a58 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v48(a58 a58Var, Context context, r63 r63Var, r63 r63Var2, oab oabVar, boolean z, boolean z2, boolean z3, Context context2, y48 y48Var, boolean[] zArr) {
        super(context, r63Var, true);
        this.x = a58Var;
        this.d = r63Var2;
        this.e = oabVar;
        this.f = z;
        this.h = z2;
        this.n = z3;
        this.r = context2;
        this.s = y48Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x0152, code lost:
    
        if (r15.stories_hidden != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
    
        if (r8.stories_hidden != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0154, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0920, code lost:
    
        if (r2.bot_can_edit != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x094b, code lost:
    
        if (r2.delete_stories != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0955, code lost:
    
        if (r0.delete_stories != false) goto L341;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x042d  */
    /* JADX WARN: Type inference failed for: r1v194, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v4 */
    @Override // f9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        TL_stories.StoryItem storyItem;
        r63 r63Var;
        Context context;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem2;
        z48 z48Var;
        byte b;
        v48 v48Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        r63 r63Var2;
        r63 r63Var3;
        String M0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final v48 v48Var2;
        r63 r63Var4;
        String str;
        int i;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        r63 r63Var5;
        byte b2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        s96 s96Var;
        TLRPC.GroupCall groupCall;
        s96 s96Var2;
        String str2;
        String M02;
        int i2;
        String str3;
        int i3;
        boolean z;
        ArrayList arrayList2;
        g6b g6bVar;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet i1;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i12;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Chat L0;
        TLRPC.Chat chat;
        TLRPC.User user;
        final byte b3;
        String str4;
        oab oabVar;
        r63 r63Var6;
        final oab oabVar2;
        int i4;
        int i5;
        int i6;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        Context context2;
        byte b4;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str5;
        int i7;
        TLRPC.User user2;
        long j;
        TLRPC.Chat chat2;
        byte b5;
        byte b6;
        a58 a58Var = this.x;
        r63 r63Var7 = a58Var.r0;
        z48 z48Var2 = a58Var.E1;
        boolean z2 = this.h;
        Context context3 = this.r;
        final oab oabVar3 = this.e;
        r63 r63Var8 = this.d;
        if (z2 || z48Var2.b != null) {
            TL_stories.StoryItem storyItem5 = z48Var2.a;
            byte b7 = 6;
            if (z48Var2.b != null) {
                context = context3;
                storyItem = storyItem5;
                r63Var = r63Var8;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, jb6.M0(2131752542, null), false, r63Var8).setOnClickListener(new m48(this, b7));
            } else {
                storyItem = storyItem5;
                r63Var = r63Var8;
                context = context3;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem == null) {
                return;
            }
            if (!(a58Var.s1 || a58Var.I1.g(a58Var.r1)) || z48Var2.f || (storyItem2 = z48Var2.a) == null) {
                v48Var = this;
                z48Var = z48Var2;
                b = 12;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                bu5 bu5Var = new bu5(actionBarPopupWindow$ActionBarPopupWindowLayout2, r63Var);
                bu5Var.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new vw2(actionBarPopupWindow$ActionBarPopupWindowLayout2, (byte) 1), false);
                bu5Var.j();
                z48Var = z48Var2;
                v3b A = a58Var.getStoriesController().A(a58Var.r1, true);
                v3b A2 = a58Var.I1.A(a58Var.r1, false);
                b = 12;
                r63 r63Var9 = r63Var;
                r63Var = r63Var9;
                v48Var = this;
                bu5.e(bu5Var, A, hashSet, A2 != null && A2.a(), new ud7((Object) this, (Object) r63Var, (Object) storyItem2, (byte) 20), new jv0((Object) this, (Object) hashSet, (Object) storyItem2, (Object) r63Var9, (byte) 15));
                int b8 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(bu5Var.B);
                a8 a8Var = new a8(0, r63Var, a58Var.getContext(), false, false);
                a58Var.u3 = a8Var;
                a8Var.j(jb6.M0(2131744494, null), R.drawable.menu_album_add, null);
                a8 a8Var2 = a58Var.u3;
                a8Var2.Q = new q48(actionBarPopupWindow$ActionBarPopupWindowLayout2, b8, (byte) 1);
                a8Var2.setOnClickListener(new m48(v48Var, b));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a58Var.u3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                j8 j8Var = new j8(cmb.G8, r63Var, a58Var.getContext());
                j8Var.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(j8Var, qoe.o(-1, 8));
            }
            if (a58Var.s1) {
                boolean isEmpty = storyItem.privacy.isEmpty();
                int i8 = a58Var.s2;
                y7b y7bVar = isEmpty ? new y7b(3, i8, new ArrayList()) : new y7b(i8, storyItem.privacy);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout9 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                r63Var2 = r63Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout9;
                a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, jb6.M0(2131742541, null), false, r63Var2);
                c.setSubtext(y7bVar.toString());
                c.setOnClickListener(new jw4(v48Var, y7bVar, storyItem, b));
                c.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                r63Var2 = r63Var;
            }
            v48Var.r(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (a58Var.s1 || v48Var.f) {
                j8 j8Var2 = new j8(cmb.G8, r63Var2, a58Var.getContext());
                j8Var2.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(j8Var2, qoe.o(-1, 8));
            }
            if (!a58Var.S2 && !z48Var.f && ((a58Var.A0() || oc7.r1(a58Var.s2).e5()) && v48Var.n)) {
                a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, jb6.M0(a58Var.A0() ? 2131751225 : 2131751157, null), false, r63Var2);
                a58Var.i1 = c2;
                r63 r63Var10 = r63Var2;
                r63Var2 = r63Var10;
                c2.setOnClickListener(new oh(v48Var, r63Var10, v48Var.r, oabVar3, v48Var.s, (byte) 12));
                if (a58Var.I1.L(a58Var.r1) && z48Var.e && !gda.b()) {
                    a58Var.i1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem6 = z48Var.a;
            if (storyItem6 == null || !z48Var.e || z48Var.f || !(storyItem6.pinned || a58Var.B0())) {
                r63Var3 = r63Var2;
            } else {
                r63Var3 = r63Var2;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, jb6.M0(2131744360, null), false, r63Var2).setOnClickListener(new oh(v48Var, v48Var.r, storyItem, oabVar3, v48Var.s, (byte) 13));
            }
            if ((a58Var.s1 || (a58Var.t1 && oc7.r1(a58Var.s2).N1().g(storyItem.dialogId))) && !z48Var.f) {
                boolean z3 = storyItem.pinned;
                boolean z4 = !z3;
                if (a58Var.s1) {
                    if (z3) {
                        str = null;
                        i = 2131754102;
                    } else {
                        i = 2131745643;
                        str = null;
                    }
                    M0 = jb6.M0(i, str);
                } else {
                    M0 = jb6.M0(!z3 ? 2131745644 : 2131746045, null);
                }
                r63 r63Var11 = r63Var3;
                a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z3 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, M0, false, r63Var11);
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                x73 x73Var = new x73(this, storyItem, z4, r63Var11, (byte) 4);
                v48Var2 = this;
                r63Var4 = r63Var11;
                c3.setOnClickListener(x73Var);
            } else {
                v48Var2 = this;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                r63Var4 = r63Var3;
            }
            v48Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (a58Var.S2 || z48Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                r63Var5 = r63Var4;
            } else {
                if (z48Var.e) {
                    i3 = 2131745642;
                    str3 = null;
                } else {
                    str3 = null;
                    i3 = 2131745673;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                r63Var5 = r63Var4;
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, jb6.M0(i3, str3), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 7));
            }
            if (!oc7.r1(a58Var.s2).H3() && !z48Var.f && !a58Var.t1) {
                a58Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (a58Var.t1 && a58Var.K2) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, jb6.M0(2131751699, null), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 8));
            }
            if (a58Var.K2) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, jb6.M0(2131752935, null), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 9));
            }
            TL_stories.StoryItem storyItem7 = z48Var.a;
            if (storyItem7 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem7.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (s96Var2 = s96.N) != null && s96Var2.i(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    s96 s96Var3 = s96.N;
                    boolean z5 = s96Var3 != null && s96Var3.r();
                    if (z5) {
                        str2 = null;
                        M02 = jb6.M0(2131743536, null);
                        i2 = R.drawable.msg_voice_unmuted;
                    } else {
                        str2 = null;
                        M02 = jb6.M0(2131748071, null);
                        i2 = R.drawable.msg_voice_muted;
                    }
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i2, M02, false, r63Var5).setOnClickListener(new v6((byte) 6, v48Var2, z5));
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, jb6.M0(2131754751, str2), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 10));
                }
            }
            if (z48Var.f) {
                final byte b9 = 1;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, jb6.M0(2131746955, null), false, r63Var5).setOnClickListener(new View.OnClickListener(v48Var2) { // from class: n48
                    public final /* synthetic */ v48 b;

                    {
                        this.b = v48Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b10 = b9;
                        oab oabVar4 = oabVar3;
                        v48 v48Var3 = this.b;
                        switch (b10) {
                            case 0:
                                v48 v48Var4 = v48Var3.x.j1;
                                if (v48Var4 != null) {
                                    v48Var4.a();
                                }
                                oabVar4.S();
                                break;
                            default:
                                v48 v48Var5 = v48Var3.x.j1;
                                if (v48Var5 != null) {
                                    v48Var5.a();
                                }
                                oabVar4.S();
                                break;
                        }
                    }
                });
            }
            if (z48Var.f && (a58Var.r1 == z8c.h(a58Var.s2).e() || sd2.w(14, oc7.r1(a58Var.s2).L0(Long.valueOf(-a58Var.r1))) || ((s96Var = oabVar3.B0) != null && z48Var.i(s96Var.j()) && (groupCall = oabVar3.B0.s) != null && groupCall.creator))) {
                b2 = 1;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, jb6.M0(2131748547, null), false, r63Var5).setOnClickListener(new o48(v48Var2, r63Var5, oabVar3, b2));
            } else {
                b2 = 1;
            }
            if (z48Var.f) {
                a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, jb6.M0(2131748577, null), false, r63Var5);
                int i9 = cmb.p7;
                c4.h(0.12f, i9);
                c4.d(r63Var5.h(i9), r63Var5.h(i9));
                c4.setOnClickListener(new o48(v48Var2, r63Var5, oabVar3, (byte) 2));
            }
            if (!z48Var.f) {
                if (!a58Var.s1) {
                    h4b N1 = oc7.r1(a58Var.s2).N1();
                    TL_stories.StoryItem storyItem8 = z48Var.a;
                    int i10 = N1.a;
                    if (storyItem8 != null) {
                        if (storyItem8.dialogId != z8c.h(i10).e()) {
                            if (storyItem8.dialogId > 0) {
                                TLRPC.User W1 = oc7.r1(i10).W1(Long.valueOf(storyItem8.dialogId));
                                if (W1 != null) {
                                    if (W1.bot) {
                                    }
                                }
                            }
                            if (storyItem8.dialogId < 0) {
                                TLRPC.Chat L02 = oc7.r1(i10).L0(Long.valueOf(-storyItem8.dialogId));
                                if (L02 != null) {
                                    if (!L02.creator) {
                                        boolean z6 = storyItem8.out;
                                        if (z6) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = L02.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z6) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = L02.admin_rights;
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
                a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, jb6.M0(2131751535, null), false, r63Var5);
                int i11 = cmb.p7;
                c5.h(0.12f, i11);
                c5.d(r63Var5.h(i11), r63Var5.h(i11));
                c5.setOnClickListener(new m48(v48Var2, (byte) 13));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            arrayList = null;
        } else {
            r(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String p = lo7.p(a58Var.r1, 0L, false);
            boolean d0 = NotificationsCustomSettingsActivity.d0(a58Var.s2, a58Var.r1);
            final r63 r63Var12 = r63Var8;
            long j2 = a58Var.r1;
            int i13 = a58Var.s2;
            if (j2 > 0) {
                ?? W12 = oc7.r1(i13).W1(Long.valueOf(a58Var.r1));
                chat = W12;
                L0 = null;
                user = W12;
            } else {
                L0 = oc7.r1(i13).L0(Long.valueOf(-a58Var.r1));
                chat = L0;
                user = null;
            }
            String trim = user == null ? L0 == null ? "" : L0.title : m9c.k(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str6 = trim;
            if (m9c.C(a58Var.r1) || a58Var.A0()) {
                v48Var2 = this;
                b3 = 0;
                str4 = null;
                oabVar = oabVar3;
            } else {
                if (d0) {
                    j = 0;
                    oabVar = oabVar3;
                    str4 = null;
                    chat2 = L0;
                    a8 c6 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, jb6.M0(2131747596, null), false, r63Var12);
                    final byte b10 = 0;
                    b3 = 0;
                    final TLRPC.Chat chat3 = chat;
                    user2 = user;
                    View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: t48
                        public final /* synthetic */ v48 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b11 = b10;
                            String str7 = str6;
                            TLObject tLObject = chat3;
                            r63 r63Var13 = r63Var12;
                            String str8 = p;
                            v48 v48Var3 = this.b;
                            switch (b11) {
                                case 0:
                                    a58 a58Var2 = v48Var3.x;
                                    oc7.r1(a58Var2.s2).W3.edit().putBoolean("stories_" + str8, false).apply();
                                    lo7.n(a58Var2.s2).c0(a58Var2.r1, 0L, true);
                                    u31 V = new c41(a58Var2.S0, r63Var13).V(Arrays.asList(tLObject), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    v48 v48Var4 = a58Var2.j1;
                                    if (v48Var4 != null) {
                                        v48Var4.a();
                                        break;
                                    }
                                    break;
                                default:
                                    a58 a58Var3 = v48Var3.x;
                                    oc7.r1(a58Var3.s2).W3.edit().putBoolean("stories_" + str8, true).apply();
                                    lo7.n(a58Var3.s2).c0(a58Var3.r1, 0L, true);
                                    u31 V2 = new c41(a58Var3.S0, r63Var13).V(Arrays.asList(tLObject), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    v48 v48Var5 = a58Var3.j1;
                                    if (v48Var5 != null) {
                                        v48Var5.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    r63Var12 = r63Var12;
                    c6.setOnClickListener(onClickListener);
                    c6.setMultiline(false);
                } else {
                    user2 = user;
                    b3 = 0;
                    j = 0;
                    oabVar = oabVar3;
                    final TLRPC.Chat chat4 = chat;
                    chat2 = L0;
                    str4 = null;
                    a8 c7 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, jb6.M0(2131747593, null), false, r63Var12);
                    final byte b11 = 1;
                    View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: t48
                        public final /* synthetic */ v48 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b112 = b11;
                            String str7 = str6;
                            TLObject tLObject = chat4;
                            r63 r63Var13 = r63Var12;
                            String str8 = p;
                            v48 v48Var3 = this.b;
                            switch (b112) {
                                case 0:
                                    a58 a58Var2 = v48Var3.x;
                                    oc7.r1(a58Var2.s2).W3.edit().putBoolean("stories_" + str8, false).apply();
                                    lo7.n(a58Var2.s2).c0(a58Var2.r1, 0L, true);
                                    u31 V = new c41(a58Var2.S0, r63Var13).V(Arrays.asList(tLObject), gm.S2(jb6.a0("NotificationsStoryMutedHint", null, 2131747595, str7)), null, null);
                                    V.a = 2;
                                    V.j();
                                    v48 v48Var4 = a58Var2.j1;
                                    if (v48Var4 != null) {
                                        v48Var4.a();
                                        break;
                                    }
                                    break;
                                default:
                                    a58 a58Var3 = v48Var3.x;
                                    oc7.r1(a58Var3.s2).W3.edit().putBoolean("stories_" + str8, true).apply();
                                    lo7.n(a58Var3.s2).c0(a58Var3.r1, 0L, true);
                                    u31 V2 = new c41(a58Var3.S0, r63Var13).V(Arrays.asList(tLObject), gm.S2(jb6.a0("NotificationsStoryUnmutedHint", null, 2131747592, str7)), null, null);
                                    V2.a = 2;
                                    V2.j();
                                    v48 v48Var5 = a58Var3.j1;
                                    if (v48Var5 != null) {
                                        v48Var5.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    r63Var12 = r63Var12;
                    c7.setOnClickListener(onClickListener2);
                    c7.setMultiline(false);
                }
                hs6.d0(a58Var.s2).O0(true);
                byte b12 = (user2 == null || user2.contact || !hs6.d0(a58Var.s2).I(a58Var.r1)) ? b3 : (byte) 1;
                if (a58Var.r1 > j) {
                    b5 = (user2 == null || !user2.contact) ? b3 : (byte) 1;
                    if (user2 != null) {
                    }
                    b6 = b3;
                } else {
                    b5 = (chat2 == null || sd2.r0(chat2)) ? b3 : (byte) 1;
                    if (chat2 != null) {
                    }
                    b6 = b3;
                }
                if (b12 != 0) {
                    v48Var2 = this;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, jb6.M0(2131744437, str4), false, r63Var12).setOnClickListener(new m48(v48Var2, (byte) 14));
                } else {
                    v48Var2 = this;
                    if (b5 != 0) {
                        if (b6 == 0) {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, jb6.M0(2131754118, str4), false, r63Var12).setOnClickListener(new m48(v48Var2, (byte) 15));
                        } else {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, jb6.M0(2131743601, str4), false, r63Var12).setOnClickListener(new m48(v48Var2, b3));
                        }
                    }
                }
            }
            if (z48Var2.f) {
                r63Var6 = r63Var12;
                oabVar2 = oabVar;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, jb6.M0(2131746955, str4), false, r63Var12).setOnClickListener(new View.OnClickListener(v48Var2) { // from class: n48
                    public final /* synthetic */ v48 b;

                    {
                        this.b = v48Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b102 = b3;
                        oab oabVar4 = oabVar2;
                        v48 v48Var3 = this.b;
                        switch (b102) {
                            case 0:
                                v48 v48Var4 = v48Var3.x.j1;
                                if (v48Var4 != null) {
                                    v48Var4.a();
                                }
                                oabVar4.S();
                                break;
                            default:
                                v48 v48Var5 = v48Var3.x.j1;
                                if (v48Var5 != null) {
                                    v48Var5.a();
                                }
                                oabVar4.S();
                                break;
                        }
                    }
                });
            } else {
                r63Var6 = r63Var12;
                oabVar2 = oabVar;
            }
            byte b13 = 5;
            if (oc7.r1(a58Var.s2).H3() || !z48Var2.e) {
                i4 = -16777216;
                i5 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z7 = oc7.r1(a58Var.s2).Q3;
                int i14 = 2131744195;
                if (z8c.h(a58Var.s2).p()) {
                    if (z7) {
                        i7 = R.drawable.menu_quality_sd;
                        i14 = 2131744198;
                    } else {
                        i7 = R.drawable.menu_quality_hd;
                    }
                    String M03 = jb6.M0(i14, str4);
                    i5 = R.drawable.msg_gallery_locked2;
                    i4 = -16777216;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i7, M03, false, r63Var7).setOnClickListener(new v6(b13, a58Var, z7));
                } else {
                    i4 = -16777216;
                    i5 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = a58Var.getContext().getDrawable(i5);
                    i6 = -1;
                    drawable.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    o38 o38Var = new o38(a58Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, (byte) 1);
                    int L = gm.L(24.0f);
                    int L2 = gm.L(24.0f);
                    o38Var.e = L;
                    o38Var.f = L2;
                    int L3 = gm.L(1.0f);
                    int i15 = -gm.L(2.0f);
                    o38Var.s = L3;
                    o38Var.w = i15;
                    a8 c8 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, jb6.M0(2131744195, null), false, r63Var7);
                    c8.setOnClickListener(new j38(a58Var, (byte) 7));
                    c8.setIcon(o38Var);
                    if (a58Var.S2 && a58Var.I2 && !z48Var2.f) {
                        if (z8c.h(a58Var.s2).p()) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            r63Var5 = r63Var6;
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, jb6.M0(2131745663, null), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 1));
                        } else {
                            r63Var5 = r63Var6;
                            if (oc7.r1(a58Var.s2).H3()) {
                                actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            } else {
                                context2 = context3;
                                Drawable drawable2 = context2.getDrawable(i5);
                                drawable2.setColorFilter(new PorterDuffColorFilter(on2.f(0.5f, i6, i4), PorterDuff.Mode.MULTIPLY));
                                b4 = 2;
                                o38 o38Var2 = new o38(context2.getDrawable(R.drawable.msg_gallery_locked1), drawable2, (byte) 2);
                                actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                a8 c9 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, jb6.M0(2131745663, null), false, r63Var5);
                                c9.setIcon(o38Var2);
                                c9.setOnClickListener(new jw4(v48Var2, c9, oabVar2, (byte) 13));
                                if (!oc7.r1(a58Var.s2).H3() && !a58Var.t1) {
                                    a58Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout7);
                                }
                                if (a58Var.K2) {
                                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, jb6.M0(2131751699, null), false, r63Var5).setOnClickListener(new m48(v48Var2, b4));
                                }
                                if (a58Var.K2) {
                                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, jb6.M0(2131752935, null), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 3));
                                }
                                storyItem4 = z48Var2.a;
                                if (storyItem4 != null) {
                                    if (storyItem4.translated && TextUtils.equals(storyItem4.translatedLng, s1c.G0())) {
                                        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, jb6.M0(2131749061, null), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 4));
                                    } else {
                                        b3c b3cVar = oc7.r1(a58Var.s2).i4;
                                        TL_stories.StoryItem storyItem9 = z48Var2.a;
                                        b3cVar.getClass();
                                        if (storyItem9 != null && !TextUtils.isEmpty(storyItem9.caption) && !gw3.d(storyItem9.caption) && ((storyItem9.detectedLng == null && storyItem9.translatedText != null && TextUtils.equals(storyItem9.translatedLng, s1c.G0())) || ((str5 = storyItem9.detectedLng) != null && !b3cVar.v(str5)))) {
                                            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, jb6.M0(2131743643, null), false, r63Var5).setOnClickListener(new m48(v48Var2, (byte) 5));
                                            v48Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, z48Var2.a);
                                            if (!a58Var.S2 && !m9c.C(a58Var.r1) && !a58Var.A0()) {
                                                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, jb6.M0(2131745963, null), false, r63Var5).setOnClickListener(new o48(v48Var2, oabVar2, r63Var5));
                                            }
                                            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                            context = context2;
                                            z48Var = z48Var2;
                                            arrayList = null;
                                            b2 = 1;
                                        }
                                    }
                                }
                                actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                v48Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, z48Var2.a);
                                if (!a58Var.S2) {
                                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, jb6.M0(2131745963, null), false, r63Var5).setOnClickListener(new o48(v48Var2, oabVar2, r63Var5));
                                }
                                actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                context = context2;
                                z48Var = z48Var2;
                                arrayList = null;
                                b2 = 1;
                            }
                        }
                        context2 = context3;
                    } else {
                        actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        context2 = context3;
                        r63Var5 = r63Var6;
                    }
                    b4 = 2;
                    if (!oc7.r1(a58Var.s2).H3()) {
                        a58Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout7);
                    }
                    if (a58Var.K2) {
                    }
                    if (a58Var.K2) {
                    }
                    storyItem4 = z48Var2.a;
                    if (storyItem4 != null) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    v48Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, z48Var2.a);
                    if (!a58Var.S2) {
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    context = context2;
                    z48Var = z48Var2;
                    arrayList = null;
                    b2 = 1;
                }
            }
            i6 = -1;
            if (a58Var.S2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            context2 = context3;
            r63Var5 = r63Var6;
            b4 = 2;
            if (!oc7.r1(a58Var.s2).H3()) {
            }
            if (a58Var.K2) {
            }
            if (a58Var.K2) {
            }
            storyItem4 = z48Var2.a;
            if (storyItem4 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            v48Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, z48Var2.a);
            if (!a58Var.S2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            context = context2;
            z48Var = z48Var2;
            arrayList = null;
            b2 = 1;
        }
        ?? r25 = (z48Var == null || (storyItem3 = z48Var.a) == null || (messageMedia = storyItem3.media) == null || (!k47.V2(messageMedia.document) && ((photo = z48Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : b2;
        if (z48Var != null) {
            HashSet hashSet2 = new HashSet();
            arrayList2 = new ArrayList();
            TL_stories.StoryItem storyItem10 = z48Var.a;
            if (storyItem10 != null && storyItem10.media_areas != null) {
                for (int i16 = 0; i16 < z48Var.a.media_areas.size(); i16++) {
                    TL_stories.MediaArea mediaArea2 = z48Var.a.media_areas.get(i16);
                    if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        TLRPC.Reaction reaction = mediaArea2.reaction;
                        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.Document e = vm.e(a58Var.s2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                            if (e != null && (i12 = k47.i1(e)) != null && !hashSet2.contains(Long.valueOf(i12.id))) {
                                hashSet2.add(Long.valueOf(i12.id));
                                arrayList2.add(i12);
                            }
                        }
                    }
                }
            }
            TL_stories.StoryItem storyItem11 = z48Var.a;
            if (storyItem11 == null || (arrayList3 = storyItem11.entities) == null || arrayList3.isEmpty()) {
                g4b g4bVar = z48Var.b;
                if (g4bVar != null && (g6bVar = g4bVar.c) != null) {
                    if (g6bVar.T0 != null) {
                        for (int i17 = 0; i17 < z48Var.b.c.T0.size(); i17++) {
                            pcc pccVar = (pcc) z48Var.b.c.T0.get(i17);
                            if (pccVar.a == 4 && (mediaArea = pccVar.N) != null) {
                                TLRPC.Reaction reaction2 = mediaArea.reaction;
                                if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e2 = vm.e(a58Var.s2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                    if (e2 != null && (i1 = k47.i1(e2)) != null && !hashSet2.contains(Long.valueOf(i1.id))) {
                                        hashSet2.add(Long.valueOf(i1.id));
                                        arrayList2.add(i1);
                                    }
                                }
                            }
                        }
                    }
                    CharSequence charSequence = z48Var.b.c.C0;
                    if (charSequence instanceof Spanned) {
                        z = false;
                        gn[] gnVarArr = (gn[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gn.class);
                        if (gnVarArr != null) {
                            for (gn gnVar : gnVarArr) {
                                TLRPC.Document document = gnVar.document;
                                if (document == null) {
                                    document = vm.e(a58Var.s2, gnVar.documentId);
                                }
                                if (document != null) {
                                    TLRPC.InputStickerSet i18 = k47.i1(document);
                                    if (!hashSet2.contains(Long.valueOf(i18.id))) {
                                        hashSet2.add(Long.valueOf(i18.id));
                                        arrayList2.add(i18);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i19 = 0; i19 < z48Var.a.entities.size(); i19++) {
                    TLRPC.MessageEntity messageEntity = z48Var.a.entities.get(i19);
                    if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                        TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                        if (document2 == null) {
                            document2 = vm.e(a58Var.s2, tL_messageEntityCustomEmoji.document_id);
                        }
                        if (document2 != null) {
                            TLRPC.InputStickerSet i110 = k47.i1(document2);
                            if (!hashSet2.contains(Long.valueOf(i110.id))) {
                                hashSet2.add(Long.valueOf(i110.id));
                                arrayList2.add(i110);
                            }
                        }
                    }
                }
            }
            z = false;
        } else {
            z = false;
            arrayList2 = arrayList;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z = true;
        }
        if (r25 != 0 || z) {
            j8 j8Var3 = new j8(cmb.G8, r63Var5, context);
            j8Var3.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(j8Var3, qoe.o(-1, 8));
            TLRPC.MessageMedia messageMedia3 = z48Var.a.media;
            TLObject tLObject = messageMedia3.document;
            if (tLObject == null) {
                tLObject = messageMedia3.photo;
            }
            y5b y5bVar = new y5b(v48Var2.r, a58Var.s2, tLObject, z48Var.a, r25, arrayList2, r63Var5);
            y5bVar.setOnClickListener(new n06(v48Var2, y5bVar, (byte) 16));
            y5bVar.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout6.a(y5bVar, qoe.o(-1, -2));
        }
    }

    @Override // f9
    public final void k() {
        if (!this.c) {
            byte b = 0;
            if (!this.w[0]) {
                gm.c3(new p48(this, b));
            }
        }
        a58 a58Var = this.x;
        a58Var.j1 = null;
        a58Var.i1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z) {
        z48 z48Var;
        boolean z2 = this.f;
        a58 a58Var = this.x;
        if (!z2 || ((z48Var = a58Var.E1) != null && z48Var.b != null)) {
            a58Var.s3 = null;
            a58Var.t3 = null;
            return;
        }
        Context context = a58Var.getContext();
        th8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final byte b = 0;
        final wm4 wm4Var = new wm4(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, (byte) 17);
        mx6 mx6Var = new mx6((byte) 22);
        a8[] a8VarArr = new a8[5];
        mx6Var.d = a8VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, context);
        mx6Var.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, jb6.M0(2131753721, null), false, null);
        c.setOnClickListener(new w70(swipeBack, (byte) 3));
        c.d(-328966, -328966);
        c.setSelectorColor(268435455);
        View a6Var = new a6(context, (byte) 8);
        a6Var.setMinimumWidth(gm.L(196.0f));
        a6Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a6Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(8.0f);
        a6Var.setLayoutParams(layoutParams);
        v7 v7Var = new v7(context, null);
        mx6Var.c = v7Var;
        v7Var.setMinimumWidth(gm.L(196.0f));
        v7Var.setDrawShadow(false);
        v7Var.setBackgroundColor(-14540254);
        v7Var.setTextColor(-1);
        v7Var.setOnValueChange(new h92(wm4Var, (byte) 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v7Var, qoe.o(-1, 44));
        View a6Var2 = new a6(context, (byte) 9);
        a6Var2.setMinimumWidth(gm.L(196.0f));
        a6Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a6Var2.getLayoutParams();
        if (jb6.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = gm.L(8.0f);
        a6Var2.setLayoutParams(layoutParams2);
        final byte b2 = 3;
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, jb6.M0(2131744952, null), false, null);
        c2.d(-328966, -328966);
        c2.setOnClickListener(new View.OnClickListener() { // from class: bi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wm4 wm4Var2 = wm4Var;
                switch (b3) {
                    case 0:
                        wm4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wm4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wm4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wm4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wm4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c2.setSelectorColor(268435455);
        a8VarArr[0] = c2;
        a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, jb6.M0(2131744955, null), false, null);
        c3.d(-328966, -328966);
        final byte b3 = 1;
        c3.setOnClickListener(new View.OnClickListener() { // from class: bi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                wm4 wm4Var2 = wm4Var;
                switch (b32) {
                    case 0:
                        wm4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wm4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wm4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wm4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wm4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c3.setSelectorColor(268435455);
        a8VarArr[1] = c3;
        a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, jb6.M0(2131744956, null), false, null);
        c4.d(-328966, -328966);
        final byte b4 = 2;
        c4.setOnClickListener(new View.OnClickListener() { // from class: bi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                wm4 wm4Var2 = wm4Var;
                switch (b32) {
                    case 0:
                        wm4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wm4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wm4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wm4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wm4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c4.setSelectorColor(268435455);
        a8VarArr[2] = c4;
        a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, jb6.M0(2131744959, null), false, null);
        c5.d(-328966, -328966);
        c5.setOnClickListener(new View.OnClickListener() { // from class: bi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b2;
                wm4 wm4Var2 = wm4Var;
                switch (b32) {
                    case 0:
                        wm4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wm4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wm4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wm4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wm4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c5.setSelectorColor(268435455);
        a8VarArr[3] = c5;
        a8 c6 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, jb6.M0(2131744953, null), false, null);
        c6.d(-328966, -328966);
        final byte b5 = 4;
        c6.setOnClickListener(new View.OnClickListener() { // from class: bi2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b5;
                wm4 wm4Var2 = wm4Var;
                switch (b32) {
                    case 0:
                        wm4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wm4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wm4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wm4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wm4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c6.setSelectorColor(268435455);
        a8VarArr[4] = c6;
        a58Var.s3 = mx6Var;
        mx6Var.B0(true, oab.B1);
        Context context2 = a58Var.getContext();
        r63 r63Var = this.d;
        a8 a8Var = new a8(0, r63Var, context2, false, false);
        a58Var.t3 = a8Var;
        a8Var.j(jb6.M0(2131744960, null), R.drawable.msg_speed, null);
        a58Var.g1(true);
        a58Var.t3.setMinimumWidth(gm.L(196.0f));
        a58Var.t3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a58Var.t3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a58Var.t3.getLayoutParams();
        if (jb6.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = gm.L(48.0f);
        a58Var.t3.setLayoutParams(layoutParams3);
        int b6 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) a58Var.s3.b);
        a8 a8Var2 = a58Var.t3;
        a8Var2.Q = new q48(actionBarPopupWindow$ActionBarPopupWindowLayout, b6, (byte) 0);
        a8Var2.setOnClickListener(new m48(this, (byte) 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z) {
            j8 j8Var = new j8(cmb.G8, r63Var, a58Var.getContext());
            j8Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, qoe.o(-1, 8));
        }
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat L0;
        a58 a58Var = this.x;
        if (!a58Var.t1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (L0 = oc7.r1(a58Var.s2).L0(Long.valueOf(-a58Var.r1))) == null) {
            return;
        }
        TLRPC.ChatFull M0 = oc7.r1(a58Var.s2).M0(L0.id);
        if (M0 == null) {
            M0 = cf7.Y(a58Var.s2).C0(L0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (M0 == null || !M0.can_view_stats) {
            return;
        }
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, jb6.M0(2131743226, null), false, this.d).setOnClickListener(new ef((Object) this, (Object) storyItem, (Object) this.e, (Object) L0, (byte) 13));
    }
}
