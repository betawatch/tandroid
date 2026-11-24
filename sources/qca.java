// default package

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qca extends w64 {
    public final via X;
    public final /* synthetic */ pca Y;
    public final /* synthetic */ nfa Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qca(nfa nfaVar, pca pcaVar) {
        super(100, false);
        this.Z = nfaVar;
        this.Y = pcaVar;
        this.X = new via();
    }

    @Override // w64
    public final via B1(int i) {
        int i2;
        int i3;
        w39 adapter = this.Y.h.getAdapter();
        nfa nfaVar = this.Z;
        cfa[] cfaVarArr = nfaVar.w1;
        TLRPC.Document F0 = (adapter != nfaVar.R || cfaVarArr[5].a.isEmpty()) ? null : ((k27) cfaVarArr[5].a.get(i)).F0();
        via viaVar = this.X;
        viaVar.b = 100.0f;
        viaVar.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w = ba4.w(F0.thumbs, 90, false, null, false);
            if (w != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
                viaVar.a = i2;
                viaVar.b = i3;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    viaVar.a = documentAttribute.w;
                    viaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return viaVar;
    }

    @Override // r35, d49
    public final void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        super.S(wg2Var, p49Var, view, u4Var);
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        qx4 qx4Var = collectionItemInfo != null ? new qx4(collectionItemInfo) : null;
        if (qx4Var != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) qx4Var.a;
            if (collectionItemInfo2.isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
            }
        }
    }

    @Override // t26
    public final void y0(p49 p49Var, int[] iArr) {
        super.y0(p49Var, iArr);
        pca pcaVar = this.Y;
        int i = pcaVar.F;
        if (i == 0 || nfa.j0(i)) {
            iArr[1] = Math.max(iArr[1], rfa.a(1) << 1);
        } else if (pcaVar.F == 1) {
            iArr[1] = Math.max(iArr[1], gl.L(56.0f) << 1);
        }
    }

    @Override // d49
    public final int z() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return A();
    }
}
