package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public final int E;
    public boolean F;
    public final a0.h a;
    public q b;
    public org.telegram.ui.Components.oz c;
    public f2.j0 d;
    public org.telegram.ui.Components.sl0 e;
    public final HashSet f;
    public final ArrayList h;
    public boolean n;
    public boolean r;
    public boolean s;
    public org.telegram.messenger.voip.h v;
    public int w;
    public int x;
    public int y;

    public r(int i10) {
        super(null);
        this.a = new a0.h();
        this.f = new HashSet();
        this.h = new ArrayList();
        this.E = i10;
    }

    public final void W() {
        if (this.F || this.r) {
            return;
        }
        this.F = true;
        org.telegram.ui.Components.oz ozVar = this.c;
        if (ozVar != null && !this.n) {
            ozVar.b();
        }
        q qVar = this.b;
        if (qVar != null) {
            qVar.l();
        }
        TLRPC.TL_messages_getArchivedStickers tL_messages_getArchivedStickers = new TLRPC.TL_messages_getArchivedStickers();
        ArrayList arrayList = this.h;
        tL_messages_getArchivedStickers.offset_id = arrayList.isEmpty() ? 0L : ((TLRPC.StickerSetCovered) l.d.i(1, arrayList)).set.id;
        tL_messages_getArchivedStickers.limit = 15;
        int i10 = this.E;
        tL_messages_getArchivedStickers.masks = i10 == 1;
        tL_messages_getArchivedStickers.emojis = i10 == 5;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getArchivedStickers, new o(this, 0)), this.classGuid);
    }

    public final void X(TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers) {
        if (this.s) {
            this.v = new org.telegram.messenger.voip.h(13, this, tL_messages_archivedStickers);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = tL_messages_archivedStickers.sets;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.StickerSetCovered stickerSetCovered = arrayList.get(i11);
            i11++;
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            Long valueOf = Long.valueOf(stickerSetCovered2.set.id);
            HashSet hashSet = this.f;
            if (!hashSet.contains(valueOf)) {
                hashSet.add(Long.valueOf(stickerSetCovered2.set.id));
                this.h.add(stickerSetCovered2);
                i10++;
            }
        }
        this.r = i10 <= 0;
        this.F = false;
        this.n = true;
        org.telegram.ui.Components.oz ozVar = this.c;
        if (ozVar != null) {
            ozVar.c();
        }
        Y();
        q qVar = this.b;
        if (qVar != null) {
            qVar.l();
        }
    }

    public final void Y() {
        int i10;
        this.D = 0;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.B = -1;
            this.C = -1;
            return;
        }
        int i11 = this.E;
        if (i11 == 0 || i11 == 5) {
            i10 = this.D;
            this.D = i10 + 1;
        } else {
            i10 = -1;
        }
        this.w = i10;
        int i12 = this.D;
        this.x = i12;
        this.y = arrayList.size() + i12;
        int size = arrayList.size() + this.D;
        this.D = size;
        if (this.r) {
            this.D = size + 1;
            this.C = size;
            this.B = -1;
        } else {
            this.D = size + 1;
            this.B = size;
            this.C = -1;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.E;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedStickers));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedEmojiPacks));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.ArchivedMasks));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 6));
        this.b = new q(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.c = ozVar;
        if (i10 == 0) {
            ozVar.setText(LocaleController.getString(R.string.ArchivedStickersEmpty));
        } else {
            ozVar.setText(LocaleController.getString(R.string.ArchivedMasksEmpty));
        }
        frameLayout.addView(this.c, k7.c6.c(-1.0f, -1));
        if (this.F) {
            this.c.b();
        } else {
            this.c.c();
        }
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.e = sl0Var;
        sl0Var.setFocusable(true);
        this.e.setEmptyView(this.c);
        org.telegram.ui.Components.sl0 sl0Var2 = this.e;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        sl0Var2.setLayoutManager(j0Var);
        this.e.o1();
        this.actionBar.setAdaptiveBackground(this.e);
        frameLayout.addView(this.e, k7.c6.c(-1.0f, -1));
        this.e.setAdapter(this.b);
        int i11 = 1;
        this.e.setOnItemClickListener(new j(this, i11));
        this.e.setOnScrollListener(new l3(this, i11));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.sl0 sl0Var;
        org.telegram.ui.Cells.w wVar;
        TLRPC.StickerSetCovered stickersSet;
        ArrayList arrayList;
        if (i10 != NotificationCenter.needAddArchivedStickers) {
            if (i10 != NotificationCenter.stickersDidLoad || (sl0Var = this.e) == null) {
                return;
            }
            int childCount = sl0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.e.getChildAt(i12);
                if ((childAt instanceof org.telegram.ui.Cells.w) && (stickersSet = (wVar = (org.telegram.ui.Cells.w) childAt).getStickersSet()) != null) {
                    boolean isStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickersSet.set.id);
                    if (isStickerPackInstalled) {
                        this.a.l(stickersSet.set.id);
                        org.telegram.ui.Components.gi0 gi0Var = wVar.f;
                        if (gi0Var != null) {
                            gi0Var.a(false, true);
                        }
                    }
                    wVar.a(isStickerPackInstalled, true, false);
                }
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList((List) objArr[0]);
        int size = arrayList2.size() - 1;
        while (true) {
            arrayList = this.h;
            if (size < 0) {
                break;
            }
            int size2 = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    break;
                }
                if (((TLRPC.StickerSetCovered) arrayList.get(i13)).set.id == ((TLRPC.StickerSetCovered) arrayList2.get(size)).set.id) {
                    arrayList2.remove(size);
                    break;
                }
                i13++;
            }
            size--;
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        arrayList.addAll(0, arrayList2);
        Y();
        q qVar = this.b;
        if (qVar != null) {
            qVar.s(this.x, arrayList2.size());
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 16, new Class[]{org.telegram.ui.Cells.w.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.c7));
        org.telegram.ui.Components.oz ozVar = this.c;
        int i10 = org.telegram.ui.ActionBar.k6.h6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ozVar, 2048, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.Rh;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"deleteButton"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 0, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 131072, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 196608, new Class[]{org.telegram.ui.Cells.w.class}, new String[]{"addButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Qh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        W();
        Y();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.needAddArchivedStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setPadding(0, 0, 0, i13);
        this.e.setClipToPadding(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        q qVar = this.b;
        if (qVar != null) {
            qVar.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        this.s = false;
        org.telegram.messenger.voip.h hVar = this.v;
        if (hVar != null) {
            hVar.run();
            this.v = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        this.s = true;
    }
}
