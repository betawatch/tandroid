// default package

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rj2 implements ActionMode.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ rj2(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        int i;
        switch (this.a) {
            case 0:
                sj2 sj2Var = (sj2) this.b;
                if (menuItem.getItemId() == 16908322) {
                    fj2 fj2Var = sj2Var.getParent() instanceof fj2 ? (fj2) sj2Var.getParent() : null;
                    if (fj2Var != null && (clipboardManager = (ClipboardManager) sj2Var.getContext().getSystemService(ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
                        String charSequence = primaryClip.getItemAt(0).getText().toString();
                        try {
                            i = Integer.parseInt(charSequence);
                        } catch (Exception unused) {
                            i = -1;
                        }
                        if (i > 0) {
                            fj2Var.c(charSequence, true);
                        }
                    }
                    sj2Var.m();
                }
                return true;
            default:
                return false;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                menu.add(0, R.id.paste, 0, R.string.paste);
                break;
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        byte b = this.a;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (((mc9) this.b).length() == 0) {
                    for (int size = menu.size() - 1; size >= 0; size--) {
                        int itemId = menu.getItem(size).getItemId();
                        if (itemId != 16908322 && itemId != 16908337) {
                            menu.removeItem(itemId);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    private final void a(ActionMode actionMode) {
    }

    private final void b(ActionMode actionMode) {
    }
}
