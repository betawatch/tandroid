package vh;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import ph.ga;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c2 {
    public final ph.j5 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final ga g = new ga(this, 29);
    public b2 d = b();

    public c2(ph.j5 j5Var) {
        this.a = j5Var;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.text == null) {
            pageBlock.text = new TL_iv.textEmpty();
        }
        if (pageBlock.caption == null) {
            TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
            pageCaption.text = new TL_iv.textEmpty();
            pageCaption.credit = new TL_iv.textEmpty();
            pageBlock.caption = pageCaption;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            if (pageblockblockquoteblocks.blocks == null) {
                pageblockblockquoteblocks.blocks = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_iv.PageBlock pageBlock2 = arrayList.get(i11);
                i11++;
                e(pageBlock2);
            }
            if (pageblockblockquoteblocks.caption == null) {
                pageblockblockquoteblocks.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            if (pageblockpreformatted.language == null) {
                pageblockpreformatted.language = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
            if (pageblockmath.source == null) {
                pageblockmath.source = "";
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            if (pageblockmap.geo == null) {
                pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            if (pageblocktable.title == null) {
                pageblocktable.title = new TL_iv.textEmpty();
            }
            if (pageblocktable.rows == null) {
                pageblocktable.rows = new ArrayList<>();
            }
            ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i12);
                i12++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                if (pagetablerow2 != null) {
                    if (pagetablerow2.cells == null) {
                        pagetablerow2.cells = new ArrayList<>();
                    }
                    ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        TL_iv.pageTableCell pagetablecell = arrayList3.get(i13);
                        i13++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null && pagetablecell2.text == null) {
                            pagetablecell2.text = new TL_iv.textEmpty();
                        }
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            if (pageblockbuttonrow.buttons == null) {
                pageblockbuttonrow.buttons = new ArrayList<>();
            }
            ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
            int size4 = arrayList4.size();
            while (i10 < size4) {
                TL_keyboard.PageButton pageButton = arrayList4.get(i10);
                i10++;
                TL_keyboard.PageButton pageButton2 = pageButton;
                if (pageButton2 != null && pageButton2.text == null) {
                    pageButton2.text = new TL_iv.textEmpty();
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (pageblockcollage.items == null) {
                pageblockcollage.items = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
            int size5 = arrayList5.size();
            while (i10 < size5) {
                TL_iv.PageBlock pageBlock3 = arrayList5.get(i10);
                i10++;
                e(pageBlock3);
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (pageblockslideshow.items == null) {
                pageblockslideshow.items = new ArrayList<>();
            }
            ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
            int size6 = arrayList6.size();
            while (i10 < size6) {
                TL_iv.PageBlock pageBlock4 = arrayList6.get(i10);
                i10++;
                e(pageBlock4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b2 b2Var) {
        a2 a2Var;
        ArrayList arrayList;
        TL_iv.PageBlock pageBlock;
        this.e = false;
        boolean z4 = true;
        this.f = true;
        ArrayList arrayList2 = new ArrayList(b2Var.a.length);
        a2[] a2VarArr = b2Var.a;
        int length = a2VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            a2Var = a2VarArr[i10];
            byte[] bArr = a2Var.b;
            arrayList = a2Var.i;
            try {
                SerializedData serializedData = new SerializedData(bArr);
                pageBlock = TL_iv.PageBlock.TLdeserialize(serializedData, serializedData.readInt32(z4), z4);
                serializedData.cleanup();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        z1 z1Var = b2Var.b;
        ph.j5 j5Var = this.a;
        r3 r3Var = (r3) j5Var.b;
        r3Var.k3.f(false);
        ArrayList arrayList3 = r3Var.i3;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        r3Var.s4();
        r3Var.V2.N(false);
        if (z1Var.a >= 0) {
            r3Var.post(new uf.v0(8, r3Var, z1Var));
        }
        r3Var.e3.onContentChanged();
        this.f = false;
        ((r3) j5Var.b).e3.H();
        return;
        pageBlock = new TL_iv.pageBlockParagraph();
        pageBlock.text = new TL_iv.textEmpty();
        a aVar = new a(pageBlock, a2Var.c, a2Var.d, a2Var.a);
        aVar.e = a2Var.e;
        aVar.f = a2Var.f;
        aVar.i = a2Var.g;
        aVar.g = a2Var.h;
        aVar.h = arrayList != null ? new ArrayList(arrayList) : null;
        aVar.k.addAll(a2Var.j);
        arrayList2.add(aVar);
        i10++;
        z4 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.TextView, vh.d1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [vh.i5] */
    public final b2 b() {
        z1 z1Var;
        i0 i0Var;
        ph.j5 j5Var = this.a;
        ArrayList arrayList = ((r3) j5Var.b).i3;
        HashMap hashMap = new HashMap();
        b2 b2Var = this.d;
        if (b2Var != null) {
            for (a2 a2Var : b2Var.a) {
                hashMap.put(Long.valueOf(a2Var.a), a2Var);
            }
        }
        a2[] a2VarArr = new a2[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a aVar = (a) arrayList.get(i10);
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList2 = aVar.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            a2 a2Var2 = (a2) hashMap.get(Long.valueOf(aVar.a));
            if (a2Var2 != null && a2Var2.c == aVar.c && a2Var2.d == aVar.d && a2Var2.e == aVar.e && a2Var2.f == aVar.f && a2Var2.g == aVar.i && a2Var2.h == aVar.g) {
                ArrayList arrayList3 = a2Var2.i;
                ArrayList arrayList4 = aVar.h;
                if (arrayList3 != arrayList4) {
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            if (arrayList3.get(i11) != arrayList4.get(i11)) {
                                break;
                            }
                        }
                    }
                }
                if (a2Var2.j.equals(arrayList2) && Arrays.equals(a2Var2.b, byteArray)) {
                    a2VarArr[i10] = a2Var2;
                }
            }
            a2VarArr[i10] = new a2(aVar.a, byteArray, aVar.c, aVar.d, aVar.e, aVar.f, aVar.i, aVar.g, aVar.h != null ? new ArrayList(aVar.h) : null, new ArrayList(arrayList2));
        }
        View findFocus = ((r3) j5Var.b).findFocus();
        if (findFocus instanceof d1) {
            ?? r12 = (d1) findFocus;
            int selectionStart = r12.getSelectionStart();
            int selectionEnd = r12.getSelectionEnd();
            ?? U2 = r3.U2(r12);
            if (U2 == 0 || U2.getRow() == null) {
                if (!(r12 instanceof i0)) {
                    ViewParent parent = r12.getParent();
                    while (true) {
                        if (parent == null) {
                            i0Var = null;
                            break;
                        }
                        if (parent instanceof i0) {
                            i0Var = (i0) parent;
                            break;
                        }
                        parent = parent.getParent();
                    }
                } else {
                    i0Var = (i0) r12;
                }
                if (i0Var == null || i0Var.getRow() == null) {
                    while (r12 != 0 && !(r12 instanceof v5)) {
                        Object parent2 = r12.getParent();
                        r12 = parent2 instanceof View ? (View) parent2 : 0;
                    }
                    if (r12 instanceof v5) {
                        v5 v5Var = (v5) r12;
                        if (v5Var.getRow() != null) {
                            z1Var = new z1(v5Var.getRow().a, -1, selectionStart, selectionEnd);
                        }
                    }
                } else {
                    z1Var = new z1(i0Var.getRow().a, -1, selectionStart, selectionEnd);
                }
            } else if (r12 == U2.getTitleEditText()) {
                z1Var = new z1(U2.getRow().a, 0, selectionStart, selectionEnd);
            } else {
                l5 o10 = U2.o(r12);
                z1Var = new z1(U2.getRow().a, o10 != null ? U2.k(o10.b) : -1, selectionStart, selectionEnd);
            }
            return new b2(a2VarArr, z1Var);
        }
        z1Var = z1.e;
        return new b2(a2VarArr, z1Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        if (!this.e || this.f) {
            return;
        }
        b2 b10 = b();
        this.e = false;
        b2 b2Var = this.d;
        if (b2Var != null) {
            a2[] a2VarArr = b2Var.a;
            a2[] a2VarArr2 = b10.a;
            if (a2VarArr.length == a2VarArr2.length) {
                for (int i10 = 0; i10 < a2VarArr.length; i10++) {
                    if (a2VarArr[i10] == a2VarArr2[i10]) {
                    }
                }
                return;
            }
        }
        b2 b2Var2 = this.d;
        ArrayDeque arrayDeque = this.b;
        arrayDeque.addLast(b2Var2);
        while (arrayDeque.size() > 150) {
            arrayDeque.removeFirst();
        }
        this.c.clear();
        this.d = b10;
        ((r3) this.a.b).e3.H();
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        c();
    }

    public final void f(int i10, int i11) {
        if (this.f) {
            return;
        }
        if (i10 > 16 || i11 > 16) {
            d();
        }
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.e = true;
        ga gaVar = this.g;
        AndroidUtilities.cancelRunOnUIThread(gaVar);
        AndroidUtilities.runOnUIThread(gaVar, 800L);
        ((r3) this.a.b).e3.H();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.b.addLast(this.d);
        b2 b2Var = (b2) arrayDeque.removeLast();
        this.d = b2Var;
        a(b2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((r3) this.a.b).e3.H();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        b2 b2Var = (b2) arrayDeque.removeLast();
        this.d = b2Var;
        a(b2Var);
    }
}
