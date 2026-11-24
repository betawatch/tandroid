// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p27 extends os3 {
    public final byte E;
    public b27 F;
    public c27 G;
    public final byte y;

    public p27(Context context, boolean z) {
        super(context, z);
        if (1 == o27.a(context.getResources().getConfiguration())) {
            this.y = (byte) 21;
            this.E = (byte) 22;
        } else {
            this.y = (byte) 22;
            this.E = (byte) 21;
        }
    }

    @Override // os3, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        v17 v17Var;
        int i;
        int pointToPosition;
        int i2;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                v17Var = (v17) headerViewListAdapter.getWrappedAdapter();
            } else {
                v17Var = (v17) adapter;
                i = 0;
            }
            c27 item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= v17Var.getCount()) ? null : v17Var.getItem(i2);
            c27 c27Var = this.G;
            if (c27Var != item) {
                y17 y17Var = v17Var.a;
                if (c27Var != null) {
                    this.F.B(y17Var, c27Var);
                }
                this.G = item;
                if (item != null) {
                    this.F.g0(y17Var, item);
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
                (adapter instanceof HeaderViewListAdapter ? (v17) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (v17) adapter).a.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(b27 b27Var) {
        this.F = b27Var;
    }

    @Override // os3, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
