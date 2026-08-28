package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public org.telegram.ui.ActionBar.w0 H;
    public boolean I;
    public final boolean J;
    public w60 K;
    public FrameLayout a;
    public org.telegram.ui.Components.gw0 b;
    public org.telegram.ui.Components.e00 c;
    public org.telegram.ui.Components.wk0 d;
    public x60 e;
    public y60 f;
    public f2.m0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull v;
    public final long w;
    public int x;
    public int y;

    public z60(long j10) {
        super(null);
        this.n = -1;
        this.w = j10;
    }

    public static /* synthetic */ void T(z60 z60Var, View view, int i9) {
        if (z60Var.getParentActivity() == null) {
            return;
        }
        if (!z60Var.I) {
            if (i9 >= z60Var.A && i9 < z60Var.B) {
                z60Var.c0(MediaDataController.getInstance(z60Var.currentAccount).getStickerSets(z60Var.b0()).get(i9 - z60Var.A), ((org.telegram.ui.Cells.k8) view).a(), false);
            }
            if (i9 == z60Var.F) {
                z60Var.c0(z60Var.r, true, false);
                return;
            }
            return;
        }
        if (i9 > z60Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.k8) view).a();
            y60 y60Var = z60Var.f;
            z60Var.c0((TLRPC.TL_messages_stickerSet) y60Var.e.get((i9 - y60Var.d.size()) - 1), a2, false);
        } else if (i9 != z60Var.f.d.size()) {
            z60Var.c0((TLRPC.TL_messages_stickerSet) z60Var.f.d.get(i9), ((org.telegram.ui.Cells.k8) view).a(), true);
        }
    }

    public static void U(z60 z60Var, TLRPC.TL_error tL_error) {
        boolean z10 = z60Var.J;
        if (tL_error != null) {
            if (z60Var.getParentActivity() != null) {
                Activity parentActivity = z60Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = z60Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                z60Var.v.emojiset = stickerSet;
            } else {
                z60Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(z60Var.currentAccount).putGroupStickerSet(z60Var.r);
        } else if (z10) {
            z60Var.v.emojiset = null;
        } else {
            z60Var.v.stickerset = null;
        }
        z60Var.g0();
        if (z10) {
            TLRPC.ChatFull chatFull = z60Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = z60Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(z60Var.currentAccount).updateChatInfo(z60Var.v, false);
        NotificationCenter.getInstance(z60Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, z60Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(z60Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(z60Var.v.id), Boolean.valueOf(z10));
        z60Var.finishFragment();
    }

    public static void Z(z60 z60Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i9 = z60Var.n;
        if (tL_messages_stickerSet == null) {
            if (z60Var.r != null) {
                org.telegram.messenger.l0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.oc.a0(z60Var), R.raw.done, 36);
            }
            z60Var.r = null;
            z60Var.s = true;
        } else {
            z60Var.r = tL_messages_stickerSet;
            z60Var.s = false;
            org.telegram.messenger.l0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.oc.a0(z60Var), R.raw.done, 36);
        }
        z60Var.g0();
        z60Var.e0(z60Var.r, false);
        if (i9 != -1) {
            if (!z60Var.I) {
                for (int i10 = 0; i10 < z60Var.d.getChildCount(); i10++) {
                    View childAt = z60Var.d.getChildAt(i10);
                    if (z60Var.d.T(childAt).b() == z60Var.A + i9) {
                        ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                        break;
                    }
                }
            }
            z60Var.e.m(z60Var.A + i9);
        }
        if (z60Var.n != -1) {
            if (!z60Var.I) {
                for (int i11 = 0; i11 < z60Var.d.getChildCount(); i11++) {
                    View childAt2 = z60Var.d.getChildAt(i11);
                    if (z60Var.d.T(childAt2).b() == z60Var.A + z60Var.n) {
                        ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            z60Var.e.m(z60Var.A + z60Var.n);
        }
    }

    public final TLRPC.StickerSet a0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.J ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int b0() {
        return this.J ? 5 : 0;
    }

    public final void c0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        cx0Var.Z = new u60(this, z10, tL_messages_stickerSet);
        cx0Var.A0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        cx0Var.show();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.J ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 24));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.H = a2;
        a2.F();
        a2.D = new cb(this, 9);
        this.H.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new x60(this, context);
        this.f = new y60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        this.d = new org.telegram.ui.Components.wk0(context, null);
        f2.n nVar = new f2.n();
        nVar.n(200L);
        nVar.m = true;
        this.d.setItemAnimator(nVar);
        f2.m0 m0Var = new f2.m0();
        this.h = m0Var;
        m0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, getResourceProvider());
        this.c = e00Var;
        e00Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.a.addView(this.c, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, this.c, 1, null);
        this.b = gw0Var;
        org.telegram.ui.Cells.e3.s2(gw0Var);
        this.a.addView(this.b);
        frameLayout.addView(this.a);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, g7.e6.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new l3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (a0(chatFull) != null) {
            this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(a0(this.v));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == b0()) {
                f0(true);
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.chatInfoDidLoad) {
            if (i9 == NotificationCenter.groupStickersDidLoad) {
                long longValue = ((Long) objArr[0]).longValue();
                if (a0(this.v) == null || a0(this.v).id != longValue) {
                    return;
                }
                f0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.w) {
            if (this.v == null && a0(chatFull) != null) {
                this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(a0(chatFull));
            }
            this.v = chatFull;
            f0(true);
        }
    }

    public final void e0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.J) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.F == -1;
                this.r = tL_messages_stickerSet;
                f0(false);
                if (z11) {
                    this.e.o(this.F);
                } else {
                    this.e.m(this.F);
                }
                if (z10) {
                    this.e.m(this.E);
                }
                w60 w60Var = this.K;
                w60Var.b = true;
                w60Var.invalidate();
                return;
            }
            int i9 = this.F;
            boolean z12 = i9 > 0;
            this.r = null;
            if (z12) {
                this.e.u(i9);
                if (z10) {
                    this.e.m(this.E);
                }
            }
            f0(false);
            w60 w60Var2 = this.K;
            w60Var2.b = false;
            w60Var2.invalidate();
        }
    }

    public final void f0(boolean z10) {
        x60 x60Var;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.C = 0;
        if (this.J) {
            this.D = 0;
            this.C = 2;
            this.E = 1;
            if (this.r != null) {
                this.C = 3;
                this.F = 2;
            }
            int i9 = this.C;
            this.C = i9 + 1;
            this.G = i9;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(b0());
        if (stickerSets.isEmpty()) {
            this.y = -1;
            this.A = -1;
            this.B = -1;
        } else {
            int i10 = this.C;
            int i11 = i10 + 1;
            this.C = i11;
            this.y = i10;
            this.A = i11;
            this.B = stickerSets.size() + i11;
            this.C = stickerSets.size() + this.C;
        }
        int i12 = this.C;
        this.C = i12 + 1;
        this.x = i12;
        g0();
        if (!z10 || (x60Var = this.e) == null) {
            return;
        }
        x60Var.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0() {
        long j10;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(b0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j10 = tL_messages_stickerSet.set.id;
            } else if (a0(this.v) != null) {
                j10 = a0(this.v).id;
            }
            if (j10 == 0) {
                for (int i9 = 0; i9 < stickerSets.size(); i9++) {
                    if (stickerSets.get(i9).set.id == j10) {
                        this.n = i9;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j10 = 0;
        if (j10 == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16, new Class[]{org.telegram.ui.Cells.k8.class, org.telegram.ui.Cells.ba.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        int i10 = org.telegram.ui.ActionBar.f6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 196608, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Uh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(b0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        f0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.r != null || this.s) && (chatFull = this.v) != null) {
            if (a0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != a0(this.v).id) {
                if (a0(this.v) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.J;
                long j10 = this.w;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.s) {
                        tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    } else {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet = this.r.set;
                        tL_inputStickerSetID.id = stickerSet.id;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_channels_setStickers = tL_channels_setEmojiStickers;
                    }
                } else {
                    TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                    tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
                    if (this.s) {
                        tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                        tL_channels_setStickers = tL_channels_setStickers2;
                    } else {
                        MessagesController.getEmojiSettings(this.currentAccount).edit().remove("group_hide_stickers_" + this.v.id).apply();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                        tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                        TLRPC.StickerSet stickerSet2 = this.r.set;
                        tL_inputStickerSetID2.id = stickerSet2.id;
                        tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                        tL_channels_setStickers = tL_channels_setStickers2;
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new m(this, 9));
            }
        }
    }

    public z60(long j10, int i9) {
        super(null);
        this.n = -1;
        this.w = j10;
        this.J = true;
    }
}
