package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ un0(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                return ((org.telegram.messenger.ij) obj).f1() - ((org.telegram.messenger.ij) obj2).f1();
            case 1:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 2:
                int i7 = obj instanceof sw0 ? ((sw0) obj).g : obj instanceof org.telegram.messenger.cp ? ((org.telegram.messenger.cp) obj).d : 0;
                int i10 = obj2 instanceof sw0 ? ((sw0) obj2).g : obj2 instanceof org.telegram.messenger.cp ? ((org.telegram.messenger.cp) obj2).d : 0;
                if (i7 < i10) {
                    return -1;
                }
                return i7 > i10 ? 1 : 0;
            case 3:
                long j3 = org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y;
                long j10 = org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y;
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 4:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).V, ((org.telegram.ui.ActionBar.j6) obj2).V);
            case 5:
                long j11 = org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y;
                long j12 = org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 6:
                return Integer.compare(((org.telegram.ui.Wallet.j0) obj2).b, ((org.telegram.ui.Wallet.j0) obj).b);
            case 7:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 8:
                long j13 = org.telegram.messenger.p10.i(((Integer) obj).intValue()).Y;
                long j14 = org.telegram.messenger.p10.i(((Integer) obj2).intValue()).Y;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 9:
                return (int) (((org.telegram.ui.web.i) obj2).c - ((org.telegram.ui.web.i) obj).c);
            case 10:
                return (int) (((org.telegram.ui.web.i) obj2).c - ((org.telegram.ui.web.i) obj).c);
            case 11:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).y, ((org.telegram.utils.twidget.m) obj).y);
            case 12:
                return ((s2.e) obj).a.compareTo(((s2.e) obj2).a);
            case 13:
                return (int) ((((ug.i1) obj).a * 100.0f) - (((ug.i1) obj2).a * 100.0f));
            default:
                return ((String) obj).compareTo((String) obj2);
        }
    }
}
