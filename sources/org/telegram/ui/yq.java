package org.telegram.ui;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yq implements ActionMode.Callback {
    public final /* synthetic */ zq a;

    public yq(zq zqVar) {
        this.a = zqVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i3;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        zq zqVar = this.a;
        xq xqVar = zqVar.getParent() instanceof xq ? (xq) zqVar.getParent() : null;
        if (xqVar != null && (clipboardManager = (ClipboardManager) zqVar.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i3 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i3 = -1;
            }
            if (i3 > 0) {
                xqVar.c(charSequence, true);
            }
        }
        zqVar.m();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, R.id.paste, 0, R.string.paste);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
