// default package

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zs9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ zs9(SearchView searchView, byte b) {
        this.a = b;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SearchView searchView = this.b;
        switch (b) {
            case 0:
                searchView.r();
                break;
            default:
                d43 d43Var = searchView.i0;
                if (d43Var instanceof kbb) {
                    d43Var.b(null);
                    break;
                }
                break;
        }
    }
}
