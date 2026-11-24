// default package

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qea extends f84 {
    public final xka X;
    public final /* synthetic */ pea Y;
    public final /* synthetic */ nha Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qea(nha nhaVar, pea peaVar) {
        super(100, false);
        this.Z = nhaVar;
        this.Y = peaVar;
        this.X = new xka();
    }

    @Override // f84
    public final xka B1(int i) {
        int i2;
        int i3;
        y59 adapter = this.Y.h.getAdapter();
        nha nhaVar = this.Z;
        cha[] chaVarArr = nhaVar.w1;
        TLRPC.Document F0 = (adapter != nhaVar.R || chaVarArr[5].a.isEmpty()) ? null : ((k47) chaVarArr[5].a.get(i)).F0();
        xka xkaVar = this.X;
        xkaVar.b = 100.0f;
        xkaVar.a = 100.0f;
        if (F0 != null) {
            TLRPC.PhotoSize w = bc4.w(F0.thumbs, 90, false, null, false);
            if (w != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
                xkaVar.a = i2;
                xkaVar.b = i3;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xkaVar.a = documentAttribute.w;
                    xkaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return xkaVar;
    }

    @Override // q55, f69
    public final void S(ki2 ki2Var, r69 r69Var, View view, u4 u4Var) {
        super.S(ki2Var, r69Var, view, u4Var);
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        sz4 sz4Var = collectionItemInfo != null ? new sz4(collectionItemInfo) : null;
        if (sz4Var != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) sz4Var.a;
            if (collectionItemInfo2.isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
            }
        }
    }

    @Override // u46
    public final void y0(r69 r69Var, int[] iArr) {
        super.y0(r69Var, iArr);
        pea peaVar = this.Y;
        int i = peaVar.F;
        if (i == 0 || nha.j0(i)) {
            iArr[1] = Math.max(iArr[1], tha.a(1) << 1);
        } else if (peaVar.F == 1) {
            iArr[1] = Math.max(iArr[1], gm.L(56.0f) << 1);
        }
    }

    @Override // f69
    public final int z() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return A();
    }
}
