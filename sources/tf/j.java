package tf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.aa;
import org.telegram.ui.ky;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout {
    public boolean a;
    public final /* synthetic */ k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context);
        this.b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0135, code lost:
    
        if (r8 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
    
        r14 = r14 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0160, code lost:
    
        if (r8 != false) goto L75;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        k kVar = this.b;
        int size = kVar.J.size();
        int i14 = kVar.r;
        boolean z4 = i14 == 0 && kVar.h == 0 && MessagesController.getInstance(kVar.C).dialogs_dict.f(DialogObject.makeFolderDialogId(1)) != null;
        View view = (View) getParent();
        int i15 = view instanceof aa ? ((aa) view).U2 : 0;
        boolean z10 = kVar.G;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i16 = paddingTop - i15;
        if (i14 == 1 && size == 1 && ((i) kVar.J.get(0)).a == 19) {
            i12 = View.MeasureSpec.getSize(i11);
            if (i12 == 0) {
                i12 = view.getMeasuredHeight();
            }
            if (i12 == 0) {
                i12 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (kVar.O.H) {
                i12 += AndroidUtilities.dp(81.0f);
            }
        } else {
            if (size != 0 && (i16 != 0 || z4)) {
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int i17 = size2 - i15;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < size; i19++) {
                    if (((i) kVar.J.get(i19)).a == 0) {
                        if (((i) kVar.J.get(i19)).f && !z10) {
                            i18 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                        i18 += dp;
                    } else {
                        if (((i) kVar.J.get(i19)).a != 1) {
                        }
                        i18 += dp;
                    }
                }
                int i20 = (size - 1) + i18;
                ArrayList arrayList = kVar.d;
                if (arrayList != null) {
                    i20 = y3.C(52.0f, (kVar.d.size() - 1) + (AndroidUtilities.dp(58.0f) * arrayList.size()), i20);
                }
                int i21 = z4 ? dp + 1 : 0;
                if (i20 < i17) {
                    i12 = ((i17 - i20) + i21) - paddingBottom;
                    if (i16 != 0) {
                        i12 -= AndroidUtilities.statusBarHeight;
                        if (!z10 && !kVar.P) {
                            i12 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                            if (getParent() instanceof ky) {
                                i13 = ((ky) getParent()).q3;
                                i12 -= i13;
                            }
                        }
                    }
                } else {
                    int i22 = i20 - i17;
                    if (i22 < i21) {
                        i12 = (i21 - i22) - paddingBottom;
                        if (i16 != 0) {
                            i12 -= AndroidUtilities.statusBarHeight;
                            if (!z10 && !kVar.P) {
                                i12 -= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                if (getParent() instanceof ky) {
                                    i13 = ((ky) getParent()).q3;
                                    i12 -= i13;
                                }
                            }
                        }
                    }
                }
            }
            i12 = 0;
        }
        int i23 = i12 >= 0 ? i12 : 0;
        if (kVar.P) {
            i23 += AndroidUtilities.dp(1000.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30));
    }
}
