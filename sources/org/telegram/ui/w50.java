package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Components.rl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final /* synthetic */ c60 J;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public w50(c60 c60Var, LaunchActivity launchActivity) {
        this.J = c60Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        c60 c60Var = this.J;
        ArrayList arrayList = c60Var.n0;
        ChatObject.Call call = c60Var.X0;
        if (call == null || call.isScheduled() || c60Var.p0) {
            return;
        }
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.C = 0;
        this.I = c60Var.X0.participants.h(MessageObject.getPeerId(c60Var.x0)) >= 0;
        if (c60Var.o1()) {
            int i10 = this.C;
            this.C = i10 + 1;
            this.H = i10;
        }
        int i11 = this.C;
        this.D = i11;
        int size = arrayList.size() + i11;
        this.C = size;
        this.E = size;
        if (arrayList.size() > 0) {
            int i12 = this.C;
            this.C = i12 + 1;
            this.F = i12;
        }
        if (!arrayList.isEmpty() && c60Var.Q0() && c60Var.X0.call.participants_count > c60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.C;
            this.C = i13 + 1;
            this.G = i13;
        }
        this.d = this.C;
        if (!c60Var.r1()) {
            this.C = c60Var.X0.visibleParticipants.size() + this.C;
        }
        this.e = this.C;
        if (c60Var.X0.invitedUsers.isEmpty() || c60Var.r1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i14 = this.C;
            this.f = i14;
            int size2 = c60Var.X0.invitedUsers.size() + i14;
            this.C = size2;
            this.h = size2;
        }
        if (c60Var.X0.shadyJoinParticipants.isEmpty() || c60Var.r1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.C;
            this.n = i15;
            int size3 = c60Var.X0.shadyJoinParticipants.size() + i15;
            this.C = size3;
            this.r = size3;
        }
        if (c60Var.X0.shadyLeftParticipants.isEmpty() || c60Var.r1()) {
            this.s = -1;
            this.v = -1;
        } else {
            int i16 = this.C;
            this.s = i16;
            int size4 = c60Var.X0.shadyLeftParticipants.size() + i16;
            this.C = size4;
            this.v = size4;
        }
        if (c60Var.o1()) {
            int i17 = this.C;
            this.x = i17;
            this.C = i17 + 2;
            this.y = i17 + 1;
        } else if (!c60Var.r1() && (((!ChatObject.isChannel(c60Var.W0) || ((chat2 = c60Var.W0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(c60Var.W0)) || (ChatObject.isChannel(c60Var.W0) && (chat = c60Var.W0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i18 = this.C;
            this.C = i18 + 1;
            this.w = i18;
        }
        int i19 = this.C;
        this.C = i19 + 1;
        this.B = i19;
    }

    @Override // f2.o0
    public final int h() {
        return this.C;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == this.B) {
            return 3;
        }
        if (i10 == this.w || i10 == this.x || i10 == this.y) {
            return 0;
        }
        if (i10 == this.F) {
            return 5;
        }
        if (i10 >= this.d && i10 < this.e) {
            return 1;
        }
        if (i10 >= this.D && i10 < this.E) {
            return 4;
        }
        if (i10 == this.G) {
            return 6;
        }
        return i10 == this.H ? 7 : 2;
    }

    @Override // f2.o0
    public final void l() {
        E();
        super.l();
    }

    @Override // f2.o0
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override // f2.o0
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override // f2.o0
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override // f2.o0
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override // f2.o0
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override // f2.o0
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        k50 k50Var;
        boolean z4;
        boolean z10;
        boolean z11;
        int i11;
        ChatObject.VideoParticipant videoParticipant;
        k50 k50Var2;
        c60 c60Var = this.J;
        ArrayList arrayList = c60Var.A0;
        ArrayList arrayList2 = c60Var.C0;
        ArrayList arrayList3 = c60Var.n0;
        ArrayList arrayList4 = c60Var.B0;
        int i12 = l1Var.f;
        View view = l1Var.a;
        TLRPC.FileLocation fileLocation = null;
        r12 = null;
        TLRPC.FileLocation fileLocation2 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        Long l10 = null;
        fileLocation = null;
        if (i12 == 0) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (i10 == this.x) {
                int i13 = org.telegram.ui.ActionBar.j6.v6;
                f6Var2 = ((org.telegram.ui.ActionBar.g3) c60Var).resourcesProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var2);
                w3Var.a(v02, v02);
                w3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            }
            if (i10 == this.y) {
                int i14 = org.telegram.ui.ActionBar.j6.v6;
                f6Var = ((org.telegram.ui.ActionBar.g3) c60Var).resourcesProvider;
                int v03 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
                w3Var.a(v03, v03);
                w3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                return;
            }
            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false), c60Var.L.getTag() != null ? 1.0f : 0.0f, 1.0f);
            w3Var.a(offsetColor, offsetColor);
            if (!ChatObject.isChannel(c60Var.W0) || (chat = c60Var.W0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                w3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                return;
            } else {
                w3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i15 = i10 - this.d;
            if (c60Var.p0) {
                if (i15 >= 0 && i15 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i15);
                }
                groupCallParticipant = null;
            } else {
                if (i15 >= 0 && i15 < c60Var.X0.visibleParticipants.size()) {
                    groupCallParticipant = c60Var.X0.visibleParticipants.get(i15);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(c60Var.x0);
                if (peerId == peerId2 && (k50Var = c60Var.f2) != null) {
                    fileLocation = k50Var.c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f10 = fileLocation3 != null ? c60Var.f2.a : 1.0f;
                boolean z12 = e4Var.getParticipant() != null && MessageObject.getPeerId(e4Var.getParticipant().peer) == peerId;
                e4Var.e(c60Var.d, groupCallParticipant, c60Var.X0, peerId2, fileLocation3, z12);
                boolean z13 = z12;
                org.telegram.ui.Cells.y3 y3Var = e4Var.x;
                y3Var.setProgress(f10);
                if (f10 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(y3Var, true, 1.0f, z13);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, z13);
                    return;
                }
            }
            return;
        }
        if (i12 != 2) {
            if (i12 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
            ChatObject.VideoParticipant participant = lVar.getParticipant();
            int i16 = i10 - this.D;
            lVar.a = c60Var.c.i(i10);
            if (c60Var.p0) {
                if (i16 >= 0 && i16 < arrayList4.size()) {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i16);
                }
                videoParticipant = null;
            } else {
                if (i16 >= 0 && i16 < arrayList3.size()) {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i16);
                }
                videoParticipant = null;
            }
            if (videoParticipant != null) {
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(c60Var.x0) && (k50Var2 = c60Var.f2) != null) {
                    fileLocation2 = k50Var2.c;
                }
                if (fileLocation2 != null) {
                    float f11 = c60Var.f2.a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.e || lVar.getRenderer() == null) {
                return;
            }
            c60.N(c60Var, lVar, false);
            c60.N(c60Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        int i17 = i10 - this.f;
        int i18 = i10 - this.n;
        if (i18 < 0 || i18 >= c60Var.X0.shadyJoinParticipants.size()) {
            int i19 = i10 - this.s;
            if (i19 < 0 || i19 >= c60Var.X0.shadyLeftParticipants.size()) {
                if (c60Var.p0) {
                    if (i17 >= 0 && i17 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i17);
                    }
                } else if (i17 >= 0 && i17 < c60Var.X0.invitedUsers.size()) {
                    l10 = c60Var.X0.invitedUsers.get(i17);
                    ChatObject.Call.InvitedUser invitedUser = c60Var.X0.invitedUsersMessageIds.get(l10);
                    z4 = invitedUser != null && invitedUser.isCalling();
                    z10 = false;
                    z11 = false;
                    if (l10 != null) {
                        i11 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        org.telegram.ui.ActionBar.k5 k5Var = v3Var.c;
                        org.telegram.ui.ActionBar.k5 k5Var2 = v3Var.b;
                        org.telegram.ui.Components.p9 p9Var = v3Var.a;
                        org.telegram.ui.Components.z8 z8Var = v3Var.e;
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(l10);
                        v3Var.f = user;
                        if (user == null) {
                            z8Var.g(21);
                        } else {
                            z8Var.r(user);
                        }
                        k5Var2.l(UserObject.getUserName(v3Var.f), false);
                        p9Var.getImageReceiver().setCurrentAccount(i11);
                        p9Var.e(v3Var.f, z8Var);
                        k5Var.l(LocaleController.getString(z11 ? R.string.ShadyLeaving : z10 ? R.string.ShadyJoining : z4 ? R.string.ConferenceCalling : R.string.Invited), false);
                        float f12 = 0.5f;
                        p9Var.setAlpha((z10 || z11) ? 0.5f : 1.0f);
                        k5Var2.setAlpha((z10 || z11) ? 0.5f : 1.0f);
                        if (!z10 && !z11) {
                            f12 = 1.0f;
                        }
                        k5Var.setAlpha(f12);
                        ImageView imageView = v3Var.d;
                        if (!z10 && !z11) {
                            r9 = 1.0f;
                        }
                        imageView.setAlpha(r9);
                        return;
                    }
                    return;
                }
                z10 = false;
            } else {
                l10 = c60Var.X0.shadyLeftParticipants.get(i10 - this.s);
                z10 = false;
                z11 = true;
                z4 = false;
                if (l10 != null) {
                }
            }
        } else {
            l10 = c60Var.X0.shadyJoinParticipants.get(i10 - this.n);
            z10 = true;
        }
        z11 = false;
        z4 = false;
        if (l10 != null) {
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        c60 c60Var = this.J;
        AccountInstance accountInstance = c60Var.d;
        Context context = this.c;
        if (i10 == 0) {
            s50 s50Var = new s50(context);
            s50Var.h = 67;
            s50Var.n = 18;
            Paint paint = new Paint();
            s50Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
            s50Var.e = 23;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
            s50Var.a = k5Var;
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            k5Var.setTextSize(16);
            k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            k5Var.setImportantForAccessibility(2);
            s50Var.addView(k5Var);
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
            s50Var.b = k5Var2;
            k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
            k5Var2.setTextSize(16);
            k5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            k5Var2.setImportantForAccessibility(2);
            s50Var.addView(k5Var2);
            ImageView imageView = new ImageView(context);
            s50Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m6, false), PorterDuff.Mode.MULTIPLY));
            s50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            s50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            s50Var.addView(imageView2);
            s50Var.setFocusable(true);
            view = s50Var;
        } else if (i10 == 1) {
            view = new t50(this, context);
        } else if (i10 == 2) {
            u50 u50Var = new u50(context);
            u50Var.n = org.telegram.ui.ActionBar.j6.rg;
            Paint paint2 = new Paint();
            u50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false));
            u50Var.e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            u50Var.a = p9Var;
            p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z4 = LocaleController.isRTL;
            u50Var.addView(p9Var, k7.b6.d(46, 46.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 11.0f, 6.0f, z4 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
            u50Var.b = k5Var3;
            k5Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
            k5Var3.setTypeface(AndroidUtilities.bold());
            k5Var3.setTextSize(16);
            k5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z10 = LocaleController.isRTL;
            u50Var.addView(k5Var3, k7.b6.d(-1, 20.0f, (z10 ? 5 : 3) | 48, z10 ? 54.0f : 67.0f, 10.0f, z10 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.k5 k5Var4 = new org.telegram.ui.ActionBar.k5(context);
            u50Var.c = k5Var4;
            k5Var4.setTextSize(15);
            k5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            k5Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, u50Var.n, false));
            k5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z11 = LocaleController.isRTL;
            u50Var.addView(k5Var4, k7.b6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 32.0f, z11 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            u50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, u50Var.n, false), PorterDuff.Mode.MULTIPLY));
            u50Var.addView(imageView3, k7.b6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            u50Var.setWillNotDraw(false);
            u50Var.setFocusable(true);
            view = u50Var;
        } else if (i10 == 4) {
            view = new v50(this, context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Components.hn(context, 12);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(c60Var.W0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                view = textView;
            }
        } else if (i10 != 7) {
            view = new View(context);
        } else {
            if (c60Var.m0 == null) {
                c60Var.m0 = new n50();
            }
            view = new eg.h0(context, c60Var.m0);
        }
        return yh.o(view, view, -1, -2);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        z40 z40Var = this.J.L;
        int i10 = l1Var.f;
        View view = l1Var.a;
        if (i10 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            int i11 = z40Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg;
            e4Var.f(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            e4Var.setDrawDivider(l1Var.b() != this.C - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            int i12 = z40Var.getTag() != null ? org.telegram.ui.ActionBar.j6.rg : org.telegram.ui.ActionBar.j6.mg;
            v3Var.a(i12, org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            v3Var.setDrawDivider(l1Var.b() != this.C - 2);
        }
    }
}
