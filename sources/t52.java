// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class t52 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ t52(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = z;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = false;
        boolean z2 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof q68) {
                    q68 q68Var = (q68) view;
                    jo6 photoEntry = q68Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z2) {
                        z = true;
                    }
                    q68Var.setHasSpoiler(z);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                if (view2 instanceof q68) {
                    q68 q68Var2 = (q68) view2;
                    jo6 photoEntry2 = q68Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z2) {
                        z = true;
                    }
                    q68Var2.setHighQuality(z);
                    break;
                }
                break;
            default:
                Float f = (Float) obj;
                q21 q21Var = ((l21) obj2).b.q;
                if (q21Var != null && !z2) {
                    q21Var.b(r4.e.getHeight() - f.floatValue());
                    break;
                }
                break;
        }
    }
}
