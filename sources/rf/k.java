package rf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fa;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public boolean a;
    public final /* synthetic */ l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context) {
        super(context);
        this.b = lVar;
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
        l lVar = this.b;
        int size = lVar.I.size();
        int i14 = lVar.r;
        boolean z10 = i14 == 0 && lVar.h == 0 && MessagesController.getInstance(lVar.B).dialogs_dict.f(DialogObject.makeFolderDialogId(1)) != null;
        View view = (View) getParent();
        int i15 = view instanceof fa ? ((fa) view).T2 : 0;
        boolean z11 = lVar.F;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i16 = paddingTop - i15;
        if (i14 == 1 && size == 1 && ((j) lVar.I.get(0)).a == 19) {
            i12 = View.MeasureSpec.getSize(i11);
            if (i12 == 0) {
                i12 = view.getMeasuredHeight();
            }
            if (i12 == 0) {
                i12 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            if (lVar.N.G) {
                i12 += AndroidUtilities.dp(81.0f);
            }
        } else {
            if (size != 0 && (i16 != 0 || z10)) {
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int i17 = size2 - i15;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < size; i19++) {
                    if (((j) lVar.I.get(i19)).a == 0) {
                        if (((j) lVar.I.get(i19)).f && !z11) {
                            i18 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                        i18 += dp;
                    } else {
                        if (((j) lVar.I.get(i19)).a != 1) {
                        }
                        i18 += dp;
                    }
                }
                int i20 = (size - 1) + i18;
                ArrayList arrayList = lVar.d;
                if (arrayList != null) {
                    i20 = x3.C(52.0f, (lVar.d.size() - 1) + (AndroidUtilities.dp(58.0f) * arrayList.size()), i20);
                }
                int i21 = z10 ? dp + 1 : 0;
                if (i20 < i17) {
                    i12 = ((i17 - i20) + i21) - paddingBottom;
                    if (i16 != 0) {
                        i12 -= AndroidUtilities.statusBarHeight;
                        if (!z11 && !lVar.O) {
                            i12 -= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                            if (getParent() instanceof ay) {
                                i13 = ((ay) getParent()).p3;
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
                            if (!z11 && !lVar.O) {
                                i12 -= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                if (getParent() instanceof ay) {
                                    i13 = ((ay) getParent()).p3;
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
        if (lVar.O) {
            i23 += AndroidUtilities.dp(1000.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30));
    }
}
