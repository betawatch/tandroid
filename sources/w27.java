// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class w27 extends vr3 {
    public final byte E;
    public i27 F;
    public j27 G;
    public final byte y;

    public w27(Context context, boolean z) {
        super(context, z);
        if (1 == v27.a(context.getResources().getConfiguration())) {
            this.y = (byte) 21;
            this.E = (byte) 22;
        } else {
            this.y = (byte) 22;
            this.E = (byte) 21;
        }
    }

    @Override // vr3, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        c27 c27Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c27Var = (c27) headerViewListAdapter.getWrappedAdapter();
            } else {
                c27Var = (c27) adapter;
                i = 0;
            }
            j27 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c27Var.getCount()) ? null : c27Var.getItem(i2);
            j27 j27Var = this.G;
            if (j27Var != item) {
                f27 f27Var = c27Var.a;
                if (j27Var != null) {
                    this.F.C(f27Var, j27Var);
                }
                this.G = item;
                if (item != null) {
                    this.F.k0(f27Var, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.y) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (i == this.E) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (c27) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (c27) adapter).a.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(i27 i27Var) {
        this.F = i27Var;
    }

    @Override // vr3, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
