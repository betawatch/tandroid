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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public org.telegram.ui.ActionBar.w0 L;
    public boolean M;
    public final boolean N;
    public p70 O;
    public FrameLayout a;
    public org.telegram.ui.Components.jx0 b;
    public org.telegram.ui.Components.a10 c;
    public org.telegram.ui.Components.vl0 d;
    public q70 e;
    public r70 f;
    public s4.c0 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull v;
    public final long w;
    public int x;
    public int y;

    public s70(long j3) {
        super(null);
        this.n = -1;
        this.w = j3;
    }

    public static /* synthetic */ void U(s70 s70Var, View view, int i10) {
        if (s70Var.getParentActivity() == null) {
            return;
        }
        if (!s70Var.M) {
            if (i10 >= s70Var.E && i10 < s70Var.F) {
                s70Var.d0(MediaDataController.getInstance(s70Var.currentAccount).getStickerSets(s70Var.c0()).get(i10 - s70Var.E), ((org.telegram.ui.Cells.n8) view).a(), false);
            }
            if (i10 == s70Var.J) {
                s70Var.d0(s70Var.r, true, false);
                return;
            }
            return;
        }
        if (i10 > s70Var.f.d.size()) {
            boolean a2 = ((org.telegram.ui.Cells.n8) view).a();
            r70 r70Var = s70Var.f;
            s70Var.d0((TLRPC.TL_messages_stickerSet) r70Var.e.get((i10 - r70Var.d.size()) - 1), a2, false);
        } else if (i10 != s70Var.f.d.size()) {
            s70Var.d0((TLRPC.TL_messages_stickerSet) s70Var.f.d.get(i10), ((org.telegram.ui.Cells.n8) view).a(), true);
        }
    }

    public static void V(s70 s70Var, TLRPC.TL_error tL_error) {
        boolean z10 = s70Var.N;
        if (tL_error != null) {
            if (s70Var.getParentActivity() != null) {
                Activity parentActivity = s70Var.getParentActivity();
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(tL_error.text);
                Toast.makeText(parentActivity, sb2.toString(), 0).show();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s70Var.r;
        if (tL_messages_stickerSet != null) {
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (z10) {
                s70Var.v.emojiset = stickerSet;
            } else {
                s70Var.v.stickerset = stickerSet;
            }
            MediaDataController.getInstance(s70Var.currentAccount).putGroupStickerSet(s70Var.r);
        } else if (z10) {
            s70Var.v.emojiset = null;
        } else {
            s70Var.v.stickerset = null;
        }
        s70Var.h0();
        if (z10) {
            TLRPC.ChatFull chatFull = s70Var.v;
            if (chatFull.emojiset != null) {
                chatFull.flags2 |= 1024;
            } else {
                chatFull.flags2 &= -1025;
            }
        } else {
            TLRPC.ChatFull chatFull2 = s70Var.v;
            if (chatFull2.stickerset == null) {
                chatFull2.flags |= 256;
            } else {
                chatFull2.flags &= -257;
            }
        }
        MessagesStorage.getInstance(s70Var.currentAccount).updateChatInfo(s70Var.v, false);
        NotificationCenter.getInstance(s70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.chatInfoDidLoad, s70Var.v, 0, Boolean.TRUE, Boolean.FALSE);
        NotificationCenter.getInstance(s70Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupPackUpdated, Long.valueOf(s70Var.v.id), Boolean.valueOf(z10));
        s70Var.finishFragment();
    }

    public static void a0(s70 s70Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i10 = s70Var.n;
        if (tL_messages_stickerSet == null) {
            if (s70Var.r != null) {
                org.telegram.messenger.a2.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.a0(s70Var), R.raw.done, 36);
            }
            s70Var.r = null;
            s70Var.s = true;
        } else {
            s70Var.r = tL_messages_stickerSet;
            s70Var.s = false;
            org.telegram.messenger.a2.o(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.a0(s70Var), R.raw.done, 36);
        }
        s70Var.h0();
        s70Var.f0(s70Var.r, false);
        if (i10 != -1) {
            if (!s70Var.M) {
                for (int i11 = 0; i11 < s70Var.d.getChildCount(); i11++) {
                    View childAt = s70Var.d.getChildAt(i11);
                    if (s70Var.d.T(childAt).b() == s70Var.E + i10) {
                        ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                        break;
                    }
                }
            }
            s70Var.e.m(s70Var.E + i10);
        }
        if (s70Var.n != -1) {
            if (!s70Var.M) {
                for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                    View childAt2 = s70Var.d.getChildAt(i12);
                    if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.n) {
                        ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                        return;
                    }
                }
            }
            s70Var.e.m(s70Var.E + s70Var.n);
        }
    }

    public final TLRPC.StickerSet b0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        return this.N ? chatFull.emojiset : chatFull.stickerset;
    }

    public final int c0() {
        return this.N ? 5 : 0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(this.N ? R.string.GroupEmojiPack : R.string.GroupStickers));
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 29));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        this.L = a2;
        a2.F();
        a2.H = new gg.m2(this, 10);
        this.L.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new q70(this, context);
        this.f = new r70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.d = new org.telegram.ui.Components.vl0(context, null);
        s4.j jVar = new s4.j();
        jVar.n(200L);
        jVar.m = true;
        this.d.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0();
        this.h = c0Var;
        c0Var.j1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, getResourceProvider());
        this.c = a10Var;
        a10Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.dpf2(58.0f)));
        this.a.addView(this.c, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, this.c, 1, null);
        this.b = jx0Var;
        og.u0.e(jx0Var);
        this.a.addView(this.b);
        frameLayout.addView(this.a);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, w7.a6.c(-1.0f, -1));
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new i(this, 13));
        this.d.setOnScrollListener(new j3(this, 15));
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        if (z11) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(getParentActivity(), this, tL_inputStickerSetShortName, !z11 ? tL_messages_stickerSet : null, null, null);
        hy0Var.d0 = new n70(this, z10, tL_messages_stickerSet);
        hy0Var.B0();
        AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
        hy0Var.show();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == c0()) {
                g0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.chatInfoDidLoad) {
            if (i10 == NotificationCenter.groupStickersDidLoad) {
                long longValue = ((Long) objArr[0]).longValue();
                if (b0(this.v) == null || b0(this.v).id != longValue) {
                    return;
                }
                g0(true);
                return;
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id == this.w) {
            if (this.v == null && b0(chatFull) != null) {
                this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(chatFull));
            }
            this.v = chatFull;
            g0(true);
        }
    }

    public final void e0(TLRPC.ChatFull chatFull) {
        this.v = chatFull;
        if (b0(chatFull) != null) {
            this.r = MediaDataController.getInstance(this.currentAccount).getGroupStickerSetById(b0(this.v));
        }
    }

    public final void f0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10) {
        if (this.N) {
            if (tL_messages_stickerSet != null) {
                boolean z11 = this.J == -1;
                this.r = tL_messages_stickerSet;
                g0(false);
                if (z11) {
                    this.e.o(this.J);
                } else {
                    this.e.m(this.J);
                }
                if (z10) {
                    this.e.m(this.I);
                }
                p70 p70Var = this.O;
                p70Var.b = true;
                p70Var.invalidate();
                return;
            }
            int i10 = this.J;
            boolean z12 = i10 > 0;
            this.r = null;
            if (z12) {
                this.e.u(i10);
                if (z10) {
                    this.e.m(this.I);
                }
            }
            g0(false);
            p70 p70Var2 = this.O;
            p70Var2.b = false;
            p70Var2.invalidate();
        }
    }

    public final void g0(boolean z10) {
        q70 q70Var;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.G = 0;
        if (this.N) {
            this.H = 0;
            this.G = 2;
            this.I = 1;
            if (this.r != null) {
                this.G = 3;
                this.J = 2;
            }
            int i10 = this.G;
            this.G = i10 + 1;
            this.K = i10;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        if (stickerSets.isEmpty()) {
            this.y = -1;
            this.E = -1;
            this.F = -1;
        } else {
            int i11 = this.G;
            int i12 = i11 + 1;
            this.G = i12;
            this.y = i11;
            this.E = i12;
            this.F = stickerSets.size() + i12;
            this.G = stickerSets.size() + this.G;
        }
        int i13 = this.G;
        this.G = i13 + 1;
        this.x = i13;
        h0();
        if (!z10 || (q70Var = this.e) == null) {
            return;
        }
        q70Var.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.n8.class, org.telegram.ui.Cells.ga.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i11 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 2, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 196608, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"optionsButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0() {
        long j3;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(c0());
        this.n = -1;
        if (!this.s) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            if (tL_messages_stickerSet != null) {
                j3 = tL_messages_stickerSet.set.id;
            } else if (b0(this.v) != null) {
                j3 = b0(this.v).id;
            }
            if (j3 == 0) {
                for (int i10 = 0; i10 < stickerSets.size(); i10++) {
                    if (stickerSets.get(i10).set.id == j3) {
                        this.n = i10;
                        return;
                    }
                }
                return;
            }
            return;
        }
        j3 = 0;
        if (j3 == 0) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkStickers(c0());
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        g0(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        if ((this.r != null || this.s) && (chatFull = this.v) != null) {
            if (b0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != b0(this.v).id) {
                if (b0(this.v) == null && this.r == null) {
                    return;
                }
                boolean z10 = this.N;
                long j3 = this.w;
                if (z10) {
                    TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                    tL_channels_setEmojiStickers.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
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
                    tL_channels_setStickers2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
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

    public s70(long j3, int i10) {
        super(null);
        this.n = -1;
        this.w = j3;
        this.N = true;
    }
}
