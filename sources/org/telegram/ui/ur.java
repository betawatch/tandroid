package org.telegram.ui;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ur implements ActionMode.Callback {
    public final /* synthetic */ vr a;

    public ur(vr vrVar) {
        this.a = vrVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i9;
        if (menuItem.getItemId() != 16908322) {
            return true;
        }
        vr vrVar = this.a;
        sr srVar = vrVar.getParent() instanceof sr ? (sr) vrVar.getParent() : null;
        if (srVar != null && (clipboardManager = (ClipboardManager) f0.e.f(vrVar.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            String charSequence = primaryClip.getItemAt(0).getText().toString();
            try {
                i9 = Integer.parseInt(charSequence);
            } catch (Exception unused) {
                i9 = -1;
            }
            if (i9 > 0) {
                srVar.c(charSequence, true);
            }
        }
        vrVar.hideActionMode();
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
