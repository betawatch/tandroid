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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s28 extends f9 {
    public boolean c;
    public final /* synthetic */ f53 d;
    public final /* synthetic */ m8b e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ w28 s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ y28 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s28(y28 y28Var, Context context, f53 f53Var, f53 f53Var2, m8b m8bVar, boolean z, boolean z2, boolean z3, Context context2, w28 w28Var, boolean[] zArr) {
        super(context, f53Var, true);
        this.x = y28Var;
        this.d = f53Var2;
        this.e = m8bVar;
        this.f = z;
        this.h = z2;
        this.n = z3;
        this.r = context2;
        this.s = w28Var;
        this.w = zArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0146, code lost:
    
        if (r1.stories_hidden != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
    
        if (r8.stories_hidden != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0148, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0905, code lost:
    
        if (r2.bot_can_edit != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0930, code lost:
    
        if (r2.delete_stories != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x093a, code lost:
    
        if (r0.delete_stories != false) goto L343;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0414  */
    /* JADX WARN: Type inference failed for: r1v141, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v4 */
    @Override // f9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        TL_stories.StoryItem storyItem;
        f53 f53Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        TL_stories.StoryItem storyItem2;
        x28 x28Var;
        byte b;
        s28 s28Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3;
        f53 f53Var2;
        final m8b m8bVar;
        f53 f53Var3;
        String M0;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4;
        final s28 s28Var2;
        f53 f53Var4;
        String str;
        int i;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout5;
        f53 f53Var5;
        byte b2;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout6;
        ArrayList arrayList;
        t76 t76Var;
        TLRPC.GroupCall groupCall;
        t76 t76Var2;
        String str2;
        String M02;
        int i2;
        String str3;
        int i3;
        ?? r22;
        Integer num;
        ArrayList arrayList2;
        TLObject tLObject;
        f4b f4bVar;
        gm[] gmVarArr;
        Integer num2;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet i1;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        TLRPC.InputStickerSet i12;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Chat K0;
        TLRPC.Chat chat;
        TLRPC.User user;
        final byte b3;
        f53 f53Var6;
        f53 f53Var7;
        int i4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout7;
        byte b4;
        TL_stories.StoryItem storyItem4;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout8;
        String str4;
        int i5;
        TLRPC.Chat chat2;
        long j;
        TLRPC.User user2;
        byte b5;
        byte b6;
        Integer num3 = 1;
        y28 y28Var = this.x;
        f53 f53Var8 = y28Var.r0;
        x28 x28Var2 = y28Var.E1;
        boolean z = this.h;
        Context context = this.r;
        final m8b m8bVar2 = this.e;
        final f53 f53Var9 = this.d;
        if (z || x28Var2.b != null) {
            TL_stories.StoryItem storyItem5 = x28Var2.a;
            byte b7 = 6;
            if (x28Var2.b != null) {
                storyItem = storyItem5;
                f53Var = f53Var9;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_cancel, k96.M0(2131752577, null), false, f53Var9).setOnClickListener(new j28(this, b7));
            } else {
                storyItem = storyItem5;
                f53Var = f53Var9;
                actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            if (storyItem == null) {
                return;
            }
            if (!(y28Var.s1 || y28Var.I1.g(y28Var.r1)) || x28Var2.f || (storyItem2 = x28Var2.a) == null) {
                s28Var = this;
                x28Var = x28Var2;
                b = 12;
            } else {
                HashSet hashSet = storyItem2.albums != null ? new HashSet(storyItem2.albums) : new HashSet();
                cs5 cs5Var = new cs5(actionBarPopupWindow$ActionBarPopupWindowLayout2, f53Var);
                cs5Var.b(R.drawable.ic_ab_back, k96.M0(2131753753, null), new lv2(actionBarPopupWindow$ActionBarPopupWindowLayout2, (byte) 1), false);
                cs5Var.j();
                x28Var = x28Var2;
                u1b A = y28Var.getStoriesController().A(y28Var.r1, true);
                u1b A2 = y28Var.I1.A(y28Var.r1, false);
                b = 12;
                f53 f53Var10 = f53Var;
                f53Var = f53Var10;
                s28Var = this;
                cs5.e(cs5Var, A, hashSet, A2 != null && A2.a(), new pc7((Object) this, (Object) f53Var, (Object) storyItem2, (byte) 17), new au0((Object) this, (Object) hashSet, (Object) storyItem2, (Object) f53Var10, (byte) 15));
                int b8 = actionBarPopupWindow$ActionBarPopupWindowLayout2.b(cs5Var.B);
                a8 a8Var = new a8(0, f53Var, y28Var.getContext(), false, false);
                y28Var.u3 = a8Var;
                a8Var.j(k96.M0(2131744568, null), R.drawable.menu_album_add, null);
                a8 a8Var2 = y28Var.u3;
                a8Var2.Q = new n28(actionBarPopupWindow$ActionBarPopupWindowLayout2, b8, (byte) 1);
                a8Var2.setOnClickListener(new j28(s28Var, b));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(y28Var.u3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.c = true;
                j8 j8Var = new j8(bkb.G8, f53Var, y28Var.getContext());
                j8Var.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(j8Var, nme.o(-1, 8));
            }
            if (y28Var.s1) {
                boolean isEmpty = storyItem.privacy.isEmpty();
                int i6 = y28Var.s2;
                w5b w5bVar = isEmpty ? new w5b(3, i6, new ArrayList()) : new w5b(i6, storyItem.privacy);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout9 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                f53Var2 = f53Var;
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout9;
                a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_view_file, k96.M0(2131742615, null), false, f53Var2);
                c.setSubtext(w5bVar.toString());
                c.setOnClickListener(new hu4(s28Var, w5bVar, storyItem, b));
                c.setItemHeight(56);
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout3 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                f53Var2 = f53Var;
            }
            s28Var.r(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
            if (y28Var.s1 || s28Var.f) {
                j8 j8Var2 = new j8(bkb.G8, f53Var2, y28Var.getContext());
                j8Var2.setTag(R.id.fit_width_tag, num3);
                actionBarPopupWindow$ActionBarPopupWindowLayout3.a(j8Var2, nme.o(-1, 8));
            }
            if (y28Var.S2 || x28Var.f || !((y28Var.A0() || na7.q1(y28Var.s2).b5()) && s28Var.n)) {
                m8bVar = m8bVar2;
            } else {
                a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout3, R.drawable.msg_edit, k96.M0(y28Var.A0() ? 2131751276 : 2131751208, null), false, f53Var2);
                y28Var.i1 = c2;
                f53 f53Var11 = f53Var2;
                f53Var2 = f53Var11;
                m8bVar = m8bVar2;
                c2.setOnClickListener(new ng(s28Var, f53Var11, s28Var.r, m8bVar2, s28Var.s, (byte) 12));
                if (y28Var.I1.L(y28Var.r1) && x28Var.e && !gba.b()) {
                    y28Var.i1.setAlpha(0.5f);
                }
            }
            TL_stories.StoryItem storyItem6 = x28Var.a;
            if (storyItem6 == null || !x28Var.e || x28Var.f || !(storyItem6.pinned || y28Var.B0())) {
                f53Var3 = f53Var2;
            } else {
                f53Var3 = f53Var2;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_cover_stories, k96.M0(2131744434, null), false, f53Var2).setOnClickListener(new ng(s28Var, s28Var.r, storyItem, m8bVar, s28Var.s, (byte) 13));
            }
            if ((y28Var.s1 || (y28Var.t1 && na7.q1(y28Var.s2).M1().g(storyItem.dialogId))) && !x28Var.f) {
                boolean z2 = storyItem.pinned;
                boolean z3 = !z2;
                if (y28Var.s1) {
                    if (z2) {
                        str = null;
                        i = 2131754134;
                    } else {
                        i = 2131745717;
                        str = null;
                    }
                    M0 = k96.M0(i, str);
                } else {
                    M0 = k96.M0(!z2 ? 2131745718 : 2131746119, null);
                }
                f53 f53Var12 = f53Var3;
                a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !z2 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, M0, false, f53Var12);
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                l63 l63Var = new l63(this, storyItem, z3, f53Var12, (byte) 4);
                s28Var2 = this;
                f53Var4 = f53Var12;
                c3.setOnClickListener(l63Var);
            } else {
                s28Var2 = this;
                actionBarPopupWindow$ActionBarPopupWindowLayout4 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                f53Var4 = f53Var3;
            }
            s28Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout4, storyItem);
            if (y28Var.S2 || x28Var.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                f53Var5 = f53Var4;
            } else {
                if (x28Var.e) {
                    i3 = 2131745716;
                    str3 = null;
                } else {
                    str3 = null;
                    i3 = 2131745747;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout10 = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                f53Var5 = f53Var4;
                actionBarPopupWindow$ActionBarPopupWindowLayout5 = actionBarPopupWindow$ActionBarPopupWindowLayout10;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_gallery, k96.M0(i3, str3), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 7));
            }
            if (!na7.q1(y28Var.s2).E3() && !x28Var.f && !y28Var.t1) {
                y28Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout5);
            }
            if (y28Var.t1 && y28Var.K2) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout5, R.drawable.msg_link, k96.M0(2131751750, null), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 8));
            }
            if (y28Var.K2) {
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, k96.M0(2131752970, null), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 9));
            }
            TL_stories.StoryItem storyItem7 = x28Var.a;
            if (storyItem7 != null) {
                TLRPC.MessageMedia messageMedia2 = storyItem7.media;
                if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (t76Var2 = t76.N) != null && t76Var2.i(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                    t76 t76Var3 = t76.N;
                    boolean z4 = t76Var3 != null && t76Var3.r();
                    if (z4) {
                        str2 = null;
                        M02 = k96.M0(2131743610, null);
                        i2 = R.drawable.msg_voice_unmuted;
                    } else {
                        str2 = null;
                        M02 = k96.M0(2131748122, null);
                        i2 = R.drawable.msg_voice_muted;
                    }
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i2, M02, false, f53Var5).setOnClickListener(new v6((byte) 6, s28Var2, z4));
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_camera_retake, k96.M0(2131754751, str2), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 10));
                }
            }
            if (x28Var.f) {
                final byte b9 = 1;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, k96.M0(2131747029, null), false, f53Var5).setOnClickListener(new View.OnClickListener(s28Var2) { // from class: k28
                    public final /* synthetic */ s28 b;

                    {
                        this.b = s28Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b10 = b9;
                        m8b m8bVar3 = m8bVar;
                        s28 s28Var3 = this.b;
                        switch (b10) {
                            case 0:
                                s28 s28Var4 = s28Var3.x.j1;
                                if (s28Var4 != null) {
                                    s28Var4.a();
                                }
                                m8bVar3.S();
                                break;
                            default:
                                s28 s28Var5 = s28Var3.x.j1;
                                if (s28Var5 != null) {
                                    s28Var5.a();
                                }
                                m8bVar3.S();
                                break;
                        }
                    }
                });
            }
            if (x28Var.f && (y28Var.r1 == y6c.h(y28Var.s2).e() || hc2.w(14, na7.q1(y28Var.s2).K0(Long.valueOf(-y28Var.r1))) || ((t76Var = m8bVar.B0) != null && x28Var.i(t76Var.j()) && (groupCall = m8bVar.B0.s) != null && groupCall.creator))) {
                b2 = 1;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_settings_old, k96.M0(2131748598, null), false, f53Var5).setOnClickListener(new l28(s28Var2, f53Var5, m8bVar, b2));
            } else {
                b2 = 1;
            }
            if (x28Var.f) {
                a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_remove, k96.M0(2131748628, null), false, f53Var5);
                int i7 = bkb.p7;
                c4.h(0.12f, i7);
                c4.d(f53Var5.h(i7), f53Var5.h(i7));
                c4.setOnClickListener(new l28(s28Var2, f53Var5, m8bVar, (byte) 2));
            }
            if (!x28Var.f) {
                if (!y28Var.s1) {
                    g2b M1 = na7.q1(y28Var.s2).M1();
                    TL_stories.StoryItem storyItem8 = x28Var.a;
                    int i8 = M1.a;
                    if (storyItem8 != null) {
                        if (storyItem8.dialogId != y6c.h(i8).e()) {
                            if (storyItem8.dialogId > 0) {
                                TLRPC.User V1 = na7.q1(i8).V1(Long.valueOf(storyItem8.dialogId));
                                if (V1 != null) {
                                    if (V1.bot) {
                                    }
                                }
                            }
                            if (storyItem8.dialogId < 0) {
                                TLRPC.Chat K02 = na7.q1(i8).K0(Long.valueOf(-storyItem8.dialogId));
                                if (K02 != null) {
                                    if (!K02.creator) {
                                        boolean z5 = storyItem8.out;
                                        if (z5) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = K02.admin_rights;
                                            if (tL_chatAdminRights != null) {
                                                if (!tL_chatAdminRights.post_stories) {
                                                }
                                            }
                                        }
                                        if (!z5) {
                                            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = K02.admin_rights;
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
                a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout6, R.drawable.msg_delete, k96.M0(2131751586, null), false, f53Var5);
                int i9 = bkb.p7;
                c5.h(0.12f, i9);
                c5.d(f53Var5.h(i9), f53Var5.h(i9));
                c5.setOnClickListener(new j28(s28Var2, (byte) 13));
                r22 = (x28Var != null || (storyItem3 = x28Var.a) == null || (messageMedia = storyItem3.media) == null || (!k27.V2(messageMedia.document) && ((photo = x28Var.a.media.photo) == null || !photo.has_stickers))) ? 0 : b2;
                if (x28Var == null) {
                    HashSet hashSet2 = new HashSet();
                    arrayList2 = new ArrayList();
                    TL_stories.StoryItem storyItem9 = x28Var.a;
                    if (storyItem9 != null && storyItem9.media_areas != null) {
                        for (int i10 = 0; i10 < x28Var.a.media_areas.size(); i10++) {
                            TL_stories.MediaArea mediaArea2 = x28Var.a.media_areas.get(i10);
                            if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                TLRPC.Reaction reaction = mediaArea2.reaction;
                                if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                    TLRPC.Document e = vl.e(y28Var.s2, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                                    if (e != null && (i12 = k27.i1(e)) != null && !hashSet2.contains(Long.valueOf(i12.id))) {
                                        hashSet2.add(Long.valueOf(i12.id));
                                        arrayList2.add(i12);
                                    }
                                }
                            }
                        }
                    }
                    TL_stories.StoryItem storyItem10 = x28Var.a;
                    if (storyItem10 == null || (arrayList3 = storyItem10.entities) == null || arrayList3.isEmpty()) {
                        f2b f2bVar = x28Var.b;
                        if (f2bVar != null && (f4bVar = f2bVar.c) != null) {
                            if (f4bVar.T0 != null) {
                                for (int i11 = 0; i11 < x28Var.b.c.T0.size(); i11++) {
                                    mac macVar = (mac) x28Var.b.c.T0.get(i11);
                                    if (macVar.a == 4 && (mediaArea = macVar.N) != null) {
                                        TLRPC.Reaction reaction2 = mediaArea.reaction;
                                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                            TLRPC.Document e2 = vl.e(y28Var.s2, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                            if (e2 != null && (i1 = k27.i1(e2)) != null && !hashSet2.contains(Long.valueOf(i1.id))) {
                                                hashSet2.add(Long.valueOf(i1.id));
                                                arrayList2.add(i1);
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence = x28Var.b.c.C0;
                            if ((charSequence instanceof Spanned) && (gmVarArr = (gm[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gm.class)) != null) {
                                int i13 = 0;
                                while (i13 < gmVarArr.length) {
                                    gm gmVar = gmVarArr[i13];
                                    TLRPC.Document document = gmVar.document;
                                    if (document == null) {
                                        num2 = num3;
                                        document = vl.e(y28Var.s2, gmVar.documentId);
                                    } else {
                                        num2 = num3;
                                    }
                                    if (document != null) {
                                        TLRPC.InputStickerSet i14 = k27.i1(document);
                                        if (!hashSet2.contains(Long.valueOf(i14.id))) {
                                            hashSet2.add(Long.valueOf(i14.id));
                                            arrayList2.add(i14);
                                        }
                                    }
                                    i13++;
                                    num3 = num2;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < x28Var.a.entities.size(); i15++) {
                            TLRPC.MessageEntity messageEntity = x28Var.a.entities.get(i15);
                            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                TLRPC.Document document2 = tL_messageEntityCustomEmoji.document;
                                if (document2 == null) {
                                    document2 = vl.e(y28Var.s2, tL_messageEntityCustomEmoji.document_id);
                                }
                                if (document2 != null) {
                                    TLRPC.InputStickerSet i16 = k27.i1(document2);
                                    if (!hashSet2.contains(Long.valueOf(i16.id))) {
                                        hashSet2.add(Long.valueOf(i16.id));
                                        arrayList2.add(i16);
                                    }
                                }
                            }
                        }
                    }
                    num = num3;
                } else {
                    num = num3;
                    arrayList2 = arrayList;
                }
                boolean z6 = arrayList2 == null && !arrayList2.isEmpty();
                if (r22 == 0 || z6) {
                    j8 j8Var3 = new j8(bkb.G8, f53Var5, context);
                    j8Var3.setTag(R.id.fit_width_tag, num);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(j8Var3, nme.o(-1, 8));
                    TLRPC.MessageMedia messageMedia3 = x28Var.a.media;
                    tLObject = messageMedia3.document;
                    if (tLObject == null) {
                        tLObject = messageMedia3.photo;
                    }
                    x3b x3bVar = new x3b(s28Var2.r, y28Var.s2, tLObject, x28Var.a, r22, arrayList2, f53Var5);
                    x3bVar.setOnClickListener(new v16(s28Var2, x3bVar, (byte) 15));
                    x3bVar.setTag(R.id.fit_width_tag, num);
                    actionBarPopupWindow$ActionBarPopupWindowLayout6.a(x3bVar, nme.o(-1, -2));
                }
                return;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        } else {
            r(actionBarPopupWindow$ActionBarPopupWindowLayout, true);
            final String p = im7.p(y28Var.r1, 0L, false);
            boolean c0 = NotificationsCustomSettingsActivity.c0(y28Var.s2, y28Var.r1);
            long j2 = y28Var.r1;
            int i17 = y28Var.s2;
            if (j2 > 0) {
                ?? V12 = na7.q1(i17).V1(Long.valueOf(y28Var.r1));
                chat = V12;
                K0 = null;
                user = V12;
            } else {
                K0 = na7.q1(i17).K0(Long.valueOf(-y28Var.r1));
                chat = K0;
                user = null;
            }
            String trim = user == null ? K0 == null ? "" : K0.title : l7c.k(user, true).trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            final String str5 = trim;
            if (l7c.B(y28Var.r1) || y28Var.A0()) {
                b3 = 0;
                s28Var2 = this;
                f53Var6 = f53Var9;
            } else {
                if (c0) {
                    chat2 = K0;
                    j = 0;
                    a8 c6 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute, k96.M0(2131747670, null), false, f53Var9);
                    final byte b10 = 0;
                    user2 = user;
                    b3 = 0;
                    final TLRPC.Chat chat3 = chat;
                    View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: q28
                        public final /* synthetic */ s28 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b11 = b10;
                            String str6 = str5;
                            TLObject tLObject2 = chat3;
                            f53 f53Var13 = f53Var9;
                            String str7 = p;
                            s28 s28Var3 = this.b;
                            switch (b11) {
                                case 0:
                                    y28 y28Var2 = s28Var3.x;
                                    na7.q1(y28Var2.s2).W3.edit().putBoolean("stories_" + str7, false).apply();
                                    im7.n(y28Var2.s2).c0(y28Var2.r1, 0L, true);
                                    m21 V = new u21(y28Var2.S0, f53Var13).V(Arrays.asList(tLObject2), gl.T2(k96.a0("NotificationsStoryMutedHint", null, 2131747669, str6)), null, null);
                                    V.a = (byte) 2;
                                    V.j();
                                    s28 s28Var4 = y28Var2.j1;
                                    if (s28Var4 != null) {
                                        s28Var4.a();
                                        break;
                                    }
                                    break;
                                default:
                                    y28 y28Var3 = s28Var3.x;
                                    na7.q1(y28Var3.s2).W3.edit().putBoolean("stories_" + str7, true).apply();
                                    im7.n(y28Var3.s2).c0(y28Var3.r1, 0L, true);
                                    m21 V2 = new u21(y28Var3.S0, f53Var13).V(Arrays.asList(tLObject2), gl.T2(k96.a0("NotificationsStoryUnmutedHint", null, 2131747666, str6)), null, null);
                                    V2.a = (byte) 2;
                                    V2.j();
                                    s28 s28Var5 = y28Var3.j1;
                                    if (s28Var5 != null) {
                                        s28Var5.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    f53Var6 = f53Var9;
                    c6.setOnClickListener(onClickListener);
                    c6.setMultiline(false);
                } else {
                    chat2 = K0;
                    j = 0;
                    final TLRPC.Chat chat4 = chat;
                    b3 = 0;
                    user2 = user;
                    a8 c7 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unmute, k96.M0(2131747667, null), false, f53Var9);
                    final byte b11 = 1;
                    View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: q28
                        public final /* synthetic */ s28 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b112 = b11;
                            String str6 = str5;
                            TLObject tLObject2 = chat4;
                            f53 f53Var13 = f53Var9;
                            String str7 = p;
                            s28 s28Var3 = this.b;
                            switch (b112) {
                                case 0:
                                    y28 y28Var2 = s28Var3.x;
                                    na7.q1(y28Var2.s2).W3.edit().putBoolean("stories_" + str7, false).apply();
                                    im7.n(y28Var2.s2).c0(y28Var2.r1, 0L, true);
                                    m21 V = new u21(y28Var2.S0, f53Var13).V(Arrays.asList(tLObject2), gl.T2(k96.a0("NotificationsStoryMutedHint", null, 2131747669, str6)), null, null);
                                    V.a = (byte) 2;
                                    V.j();
                                    s28 s28Var4 = y28Var2.j1;
                                    if (s28Var4 != null) {
                                        s28Var4.a();
                                        break;
                                    }
                                    break;
                                default:
                                    y28 y28Var3 = s28Var3.x;
                                    na7.q1(y28Var3.s2).W3.edit().putBoolean("stories_" + str7, true).apply();
                                    im7.n(y28Var3.s2).c0(y28Var3.r1, 0L, true);
                                    m21 V2 = new u21(y28Var3.S0, f53Var13).V(Arrays.asList(tLObject2), gl.T2(k96.a0("NotificationsStoryUnmutedHint", null, 2131747666, str6)), null, null);
                                    V2.a = (byte) 2;
                                    V2.j();
                                    s28 s28Var5 = y28Var3.j1;
                                    if (s28Var5 != null) {
                                        s28Var5.a();
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    f53Var6 = f53Var9;
                    c7.setOnClickListener(onClickListener2);
                    c7.setMultiline(false);
                }
                hq6.d0(y28Var.s2).O0(true);
                byte b12 = (user2 == null || user2.contact || !hq6.d0(y28Var.s2).I(y28Var.r1)) ? b3 : (byte) 1;
                if (y28Var.r1 > j) {
                    b5 = (user2 == null || !user2.contact) ? b3 : (byte) 1;
                    if (user2 != null) {
                    }
                    b6 = b3;
                } else {
                    TLRPC.Chat chat5 = chat2;
                    b5 = (chat5 == null || hc2.r0(chat5)) ? b3 : (byte) 1;
                    if (chat5 != null) {
                    }
                    b6 = b3;
                }
                if (b12 != 0) {
                    s28Var2 = this;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, k96.M0(2131744511, null), false, f53Var6).setOnClickListener(new j28(s28Var2, (byte) 14));
                } else {
                    s28Var2 = this;
                    if (b5 != 0) {
                        if (b6 == 0) {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_archive, k96.M0(2131754150, null), false, f53Var6).setOnClickListener(new j28(s28Var2, (byte) 15));
                        } else {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_unarchive, k96.M0(2131743675, null), false, f53Var6).setOnClickListener(new j28(s28Var2, b3));
                        }
                    }
                }
            }
            if (x28Var2.f) {
                f53Var7 = f53Var6;
                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_video_pip, k96.M0(2131747029, null), false, f53Var6).setOnClickListener(new View.OnClickListener(s28Var2) { // from class: k28
                    public final /* synthetic */ s28 b;

                    {
                        this.b = s28Var2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b102 = b3;
                        m8b m8bVar3 = m8bVar2;
                        s28 s28Var3 = this.b;
                        switch (b102) {
                            case 0:
                                s28 s28Var4 = s28Var3.x.j1;
                                if (s28Var4 != null) {
                                    s28Var4.a();
                                }
                                m8bVar3.S();
                                break;
                            default:
                                s28 s28Var5 = s28Var3.x.j1;
                                if (s28Var5 != null) {
                                    s28Var5.a();
                                }
                                m8bVar3.S();
                                break;
                        }
                    }
                });
            } else {
                f53Var7 = f53Var6;
            }
            byte b13 = 5;
            if (na7.q1(y28Var.s2).E3() || !x28Var2.e) {
                i4 = R.drawable.msg_gallery_locked2;
            } else {
                boolean z7 = na7.q1(y28Var.s2).Q3;
                int i18 = 2131744269;
                if (y6c.h(y28Var.s2).p()) {
                    if (z7) {
                        i5 = R.drawable.menu_quality_sd;
                        i18 = 2131744272;
                    } else {
                        i5 = R.drawable.menu_quality_hd;
                    }
                    String M03 = k96.M0(i18, null);
                    i4 = R.drawable.msg_gallery_locked2;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i5, M03, false, f53Var8).setOnClickListener(new v6(b13, y28Var, z7));
                } else {
                    i4 = R.drawable.msg_gallery_locked2;
                    Drawable drawable = y28Var.getContext().getDrawable(i4);
                    drawable.setColorFilter(new PorterDuffColorFilter(bm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                    m18 m18Var = new m18(y28Var.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, (byte) 1);
                    int L = gl.L(24.0f);
                    int L2 = gl.L(24.0f);
                    m18Var.e = L;
                    m18Var.f = L2;
                    int L3 = gl.L(1.0f);
                    int i19 = -gl.L(2.0f);
                    m18Var.s = L3;
                    m18Var.w = i19;
                    a8 c8 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.menu_quality_hd, k96.M0(2131744269, null), false, f53Var8);
                    c8.setOnClickListener(new g18(y28Var, (byte) 7));
                    c8.setIcon(m18Var);
                }
            }
            if (y28Var.S2 || !y28Var.I2 || x28Var2.f) {
                actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                f53Var5 = f53Var7;
            } else {
                if (y6c.h(y28Var.s2).p()) {
                    f53Var5 = f53Var7;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_gallery, k96.M0(2131745737, null), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 1));
                } else {
                    f53Var5 = f53Var7;
                    if (!na7.q1(y28Var.s2).E3()) {
                        Drawable drawable2 = context.getDrawable(i4);
                        drawable2.setColorFilter(new PorterDuffColorFilter(bm2.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        b4 = 2;
                        m18 m18Var2 = new m18(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, (byte) 2);
                        actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        a8 c9 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_gallery, k96.M0(2131745737, null), false, f53Var5);
                        c9.setIcon(m18Var2);
                        c9.setOnClickListener(new hu4(s28Var2, c9, m8bVar2, (byte) 13));
                        if (!na7.q1(y28Var.s2).E3() && !y28Var.t1) {
                            y28Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout7);
                        }
                        if (y28Var.K2) {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout7, R.drawable.msg_link2, k96.M0(2131751750, null), false, f53Var5).setOnClickListener(new j28(s28Var2, b4));
                        }
                        if (y28Var.K2) {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_shareout, k96.M0(2131752970, null), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 3));
                        }
                        storyItem4 = x28Var2.a;
                        if (storyItem4 != null) {
                            if (storyItem4.translated && TextUtils.equals(storyItem4.translatedLng, rzb.G0())) {
                                r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_translate, k96.M0(2131749112, null), false, f53Var5).setOnClickListener(new j28(s28Var2, (byte) 4));
                            } else {
                                b1c b1cVar = na7.q1(y28Var.s2).i4;
                                TL_stories.StoryItem storyItem11 = x28Var2.a;
                                b1cVar.getClass();
                                if (storyItem11 != null && !TextUtils.isEmpty(storyItem11.caption) && !vu3.d(storyItem11.caption) && ((storyItem11.detectedLng == null && storyItem11.translatedText != null && TextUtils.equals(storyItem11.translatedLng, rzb.G0())) || ((str4 = storyItem11.detectedLng) != null && !b1cVar.v(str4)))) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_translate, k96.M0(2131743717, null), false, f53Var5).setOnClickListener(new j28(s28Var2, b13));
                                    s28Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, x28Var2.a);
                                    if (!y28Var.S2 && !l7c.B(y28Var.r1) && !y28Var.A0()) {
                                        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, k96.M0(2131746037, null), false, f53Var5).setOnClickListener(new l28(s28Var2, m8bVar2, f53Var5));
                                    }
                                    actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    x28Var = x28Var2;
                                    b2 = 1;
                                }
                            }
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        s28Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, x28Var2.a);
                        if (!y28Var.S2) {
                            r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout8, R.drawable.msg_report, k96.M0(2131746037, null), false, f53Var5).setOnClickListener(new l28(s28Var2, m8bVar2, f53Var5));
                        }
                        actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        x28Var = x28Var2;
                        b2 = 1;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout7 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            }
            b4 = 2;
            if (!na7.q1(y28Var.s2).E3()) {
                y28Var.s0(actionBarPopupWindow$ActionBarPopupWindowLayout7);
            }
            if (y28Var.K2) {
            }
            if (y28Var.K2) {
            }
            storyItem4 = x28Var2.a;
            if (storyItem4 != null) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout8 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            s28Var2.s(actionBarPopupWindow$ActionBarPopupWindowLayout8, x28Var2.a);
            if (!y28Var.S2) {
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout6 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            x28Var = x28Var2;
            b2 = 1;
        }
        arrayList = null;
        if (x28Var != null) {
        }
        if (x28Var == null) {
        }
        if (arrayList2 == null) {
        }
        if (r22 == 0) {
        }
        j8 j8Var32 = new j8(bkb.G8, f53Var5, context);
        j8Var32.setTag(R.id.fit_width_tag, num);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(j8Var32, nme.o(-1, 8));
        TLRPC.MessageMedia messageMedia32 = x28Var.a.media;
        tLObject = messageMedia32.document;
        if (tLObject == null) {
        }
        x3b x3bVar2 = new x3b(s28Var2.r, y28Var.s2, tLObject, x28Var.a, r22, arrayList2, f53Var5);
        x3bVar2.setOnClickListener(new v16(s28Var2, x3bVar2, (byte) 15));
        x3bVar2.setTag(R.id.fit_width_tag, num);
        actionBarPopupWindow$ActionBarPopupWindowLayout6.a(x3bVar2, nme.o(-1, -2));
    }

    @Override // f9
    public final void k() {
        if (!this.c) {
            byte b = 0;
            if (!this.w[0]) {
                gl.d3(new m28(this, b));
            }
        }
        y28 y28Var = this.x;
        y28Var.j1 = null;
        y28Var.i1 = null;
    }

    public final void r(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z) {
        x28 x28Var;
        boolean z2 = this.f;
        y28 y28Var = this.x;
        if (!z2 || ((x28Var = y28Var.E1) != null && x28Var.b != null)) {
            y28Var.s3 = null;
            y28Var.t3 = null;
            return;
        }
        Context context = y28Var.getContext();
        rf8 swipeBack = actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack();
        final byte b = 0;
        final wk4 wk4Var = new wk4(this, actionBarPopupWindow$ActionBarPopupWindowLayout, false, (byte) 17);
        mv6 mv6Var = new mv6((byte) 22);
        a8[] a8VarArr = new a8[5];
        mv6Var.d = a8VarArr;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, null, context);
        mv6Var.b = actionBarPopupWindow$ActionBarPopupWindowLayout2;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setFitItems(true);
        a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, k96.M0(2131753753, null), false, null);
        c.setOnClickListener(new w60(swipeBack, (byte) 3));
        c.d(-328966, -328966);
        c.setSelectorColor(268435455);
        View a6Var = new a6(context, (byte) 8);
        a6Var.setMinimumWidth(gl.L(196.0f));
        a6Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a6Var.getLayoutParams();
        if (k96.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gl.L(8.0f);
        a6Var.setLayoutParams(layoutParams);
        v7 v7Var = new v7(context, null);
        mv6Var.c = v7Var;
        v7Var.setMinimumWidth(gl.L(196.0f));
        v7Var.setDrawShadow(false);
        v7Var.setBackgroundColor(-14540254);
        v7Var.setTextColor(-1);
        v7Var.setOnValueChange(new w72(wk4Var, (byte) 6));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(v7Var, nme.o(-1, 44));
        View a6Var2 = new a6(context, (byte) 9);
        a6Var2.setMinimumWidth(gl.L(196.0f));
        a6Var2.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(a6Var2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a6Var2.getLayoutParams();
        if (k96.a0) {
            layoutParams2.gravity = 5;
        }
        layoutParams2.width = -1;
        layoutParams2.height = gl.L(8.0f);
        a6Var2.setLayoutParams(layoutParams2);
        final byte b2 = 3;
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_0_2, k96.M0(2131745026, null), false, null);
        c2.d(-328966, -328966);
        c2.setOnClickListener(new View.OnClickListener() { // from class: ng2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wk4 wk4Var2 = wk4Var;
                switch (b3) {
                    case 0:
                        wk4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wk4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wk4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wk4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wk4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c2.setSelectorColor(268435455);
        a8VarArr[0] = c2;
        a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_slow, k96.M0(2131745029, null), false, null);
        c3.d(-328966, -328966);
        final byte b3 = 1;
        c3.setOnClickListener(new View.OnClickListener() { // from class: ng2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                wk4 wk4Var2 = wk4Var;
                switch (b32) {
                    case 0:
                        wk4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wk4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wk4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wk4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wk4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c3.setSelectorColor(268435455);
        a8VarArr[1] = c3;
        a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_normal, k96.M0(2131745030, null), false, null);
        c4.d(-328966, -328966);
        final byte b4 = 2;
        c4.setOnClickListener(new View.OnClickListener() { // from class: ng2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b4;
                wk4 wk4Var2 = wk4Var;
                switch (b32) {
                    case 0:
                        wk4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wk4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wk4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wk4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wk4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c4.setSelectorColor(268435455);
        a8VarArr[2] = c4;
        a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_fast, k96.M0(2131745033, null), false, null);
        c5.d(-328966, -328966);
        c5.setOnClickListener(new View.OnClickListener() { // from class: ng2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b2;
                wk4 wk4Var2 = wk4Var;
                switch (b32) {
                    case 0:
                        wk4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wk4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wk4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wk4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wk4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c5.setSelectorColor(268435455);
        a8VarArr[3] = c5;
        a8 c6 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_speed_superfast, k96.M0(2131745027, null), false, null);
        c6.d(-328966, -328966);
        final byte b5 = 4;
        c6.setOnClickListener(new View.OnClickListener() { // from class: ng2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b5;
                wk4 wk4Var2 = wk4Var;
                switch (b32) {
                    case 0:
                        wk4Var2.c0(true, true, 0.2f);
                        break;
                    case 1:
                        wk4Var2.c0(true, true, 0.5f);
                        break;
                    case 2:
                        wk4Var2.c0(true, true, 1.0f);
                        break;
                    case 3:
                        wk4Var2.c0(true, true, 1.5f);
                        break;
                    default:
                        wk4Var2.c0(true, true, 2.0f);
                        break;
                }
            }
        });
        c6.setSelectorColor(268435455);
        a8VarArr[4] = c6;
        y28Var.s3 = mv6Var;
        mv6Var.w0(true, m8b.B1);
        Context context2 = y28Var.getContext();
        f53 f53Var = this.d;
        a8 a8Var = new a8(0, f53Var, context2, false, false);
        y28Var.t3 = a8Var;
        a8Var.j(k96.M0(2131745034, null), R.drawable.msg_speed, null);
        y28Var.g1(true);
        y28Var.t3.setMinimumWidth(gl.L(196.0f));
        y28Var.t3.setRightIcon(R.drawable.msg_arrowright);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y28Var.t3);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) y28Var.t3.getLayoutParams();
        if (k96.a0) {
            layoutParams3.gravity = 5;
        }
        layoutParams3.width = -1;
        layoutParams3.height = gl.L(48.0f);
        y28Var.t3.setLayoutParams(layoutParams3);
        int b6 = actionBarPopupWindow$ActionBarPopupWindowLayout.b((ActionBarPopupWindow$ActionBarPopupWindowLayout) y28Var.s3.b);
        a8 a8Var2 = y28Var.t3;
        a8Var2.Q = new n28(actionBarPopupWindow$ActionBarPopupWindowLayout, b6, (byte) 0);
        a8Var2.setOnClickListener(new j28(this, (byte) 11));
        actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
        if (z) {
            j8 j8Var = new j8(bkb.G8, f53Var, y28Var.getContext());
            j8Var.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var, nme.o(-1, 8));
        }
    }

    public final void s(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
        TLRPC.Chat K0;
        y28 y28Var = this.x;
        if (!y28Var.t1 || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (K0 = na7.q1(y28Var.s2).K0(Long.valueOf(-y28Var.r1))) == null) {
            return;
        }
        TLRPC.ChatFull L0 = na7.q1(y28Var.s2).L0(K0.id);
        if (L0 == null) {
            L0 = ad7.Y(y28Var.s2).C0(K0.id, true, new CountDownLatch(1), false, false, 0);
        }
        if (L0 == null || !L0.can_view_stats) {
            return;
        }
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stats, k96.M0(2131743300, null), false, this.d).setOnClickListener(new ee((Object) this, (Object) storyItem, (Object) this.e, (Object) K0, (byte) 13));
    }
}
