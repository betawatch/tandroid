// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ut3 implements ActionMode.Callback {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public ut3(mmb mmbVar) {
        this.a = (byte) 1;
        this.c = mmbVar;
        this.b = null;
    }

    public final void b(Menu menu) {
        ob6.D0().y.getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        findItem.setVisible((((mmb) this.c).k0 == null || ((String) this.b) == null || ee9.b0().contains((String) this.b)) ? false : true);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence r;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (((xt3) obj).H(menuItem.getItemId())) {
                    actionMode.finish();
                    return true;
                }
                try {
                    return ((ActionMode.Callback) this.b).onActionItemClicked(actionMode, menuItem);
                } catch (Exception unused) {
                    return true;
                }
            default:
                mmb mmbVar = (mmb) obj;
                s8b s8bVar = mmbVar.m0;
                if (mmbVar.w()) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 16908321) {
                        if (mmbVar.w() && mmbVar.a()) {
                            if (!mmbVar.B()) {
                                CharSequence q = mmbVar.q();
                                if (q != null) {
                                    hl.g(q);
                                }
                            }
                            mmbVar.t();
                            mmbVar.e(true);
                            b0f b0fVar = mmbVar.D;
                            if (b0fVar != null) {
                                b0fVar.b();
                            }
                        }
                    } else if (itemId == 16908319) {
                        if (!mmbVar.I() && (r = mmbVar.r(mmbVar.W, false)) != null) {
                            mmbVar.u = 0;
                            mmbVar.v = r.length();
                            mmbVar.t();
                            mmbVar.v();
                            hl.r(s8bVar);
                            hl.c3(s8bVar);
                        }
                    } else if (itemId == 3) {
                        if (mmbVar.k0 != null) {
                            String language = ob6.D0().y.getLanguage();
                            xs xsVar = mmbVar.k0;
                            CharSequence q2 = mmbVar.q();
                            String str = (String) this.b;
                            s8b s8bVar2 = new s8b(this, (byte) 17);
                            o oVar = xsVar.a;
                            r3c.R0(oVar.M, oVar.N, str, language, q2, null, s8bVar2);
                        }
                        mmbVar.t();
                    } else if (itemId == R.id.menu_quote) {
                        if (mmbVar.w()) {
                            hmb hmbVar = mmbVar.W;
                            r47 messageObject = hmbVar instanceof wb2 ? ((wb2) hmbVar).getMessageObject() : null;
                            if (messageObject != null && mmbVar.q() != null) {
                                mmbVar.H(mmbVar.u, mmbVar.v, messageObject);
                                mmbVar.e(true);
                            }
                        }
                        mmbVar.t();
                    } else if (itemId == 16908320) {
                        mmbVar.C();
                        mmbVar.t();
                    } else if (itemId == 16908322) {
                        mmbVar.G();
                        mmbVar.t();
                    } else {
                        mmbVar.e(false);
                    }
                }
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        switch (this.a) {
            case 0:
                ((xt3) this.c).F();
                return ((ActionMode.Callback) this.b).onCreateActionMode(actionMode, menu);
            default:
                menu.add(0, android.R.id.copy, 0, android.R.string.copy);
                menu.add(0, R.id.menu_quote, 1, ob6.M0(2131746167, null));
                menu.add(0, 3, 2, ob6.M0(2131743611, null));
                menu.add(0, android.R.id.cut, 3, android.R.string.cut);
                menu.add(0, android.R.id.paste, 4, android.R.string.paste);
                menu.add(0, android.R.id.selectAll, 5, android.R.string.selectAll);
                return true;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        switch (this.a) {
            case 0:
                ((xt3) this.c).E();
                ((ActionMode.Callback) this.b).onDestroyActionMode(actionMode);
                break;
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        boolean z;
        mmb mmbVar;
        hmb hmbVar;
        switch (this.a) {
            case 0:
                return ((ActionMode.Callback) this.b).onPrepareActionMode(actionMode, menu);
            default:
                MenuItem findItem = menu.findItem(R.id.menu_quote);
                if (findItem != null) {
                    findItem.setVisible(((mmb) this.c).d());
                }
                MenuItem findItem2 = menu.findItem(android.R.id.copy);
                if (findItem2 != null) {
                    findItem2.setVisible(((mmb) this.c).a());
                }
                MenuItem findItem3 = menu.findItem(android.R.id.selectAll);
                if (findItem3 != null && (hmbVar = (mmbVar = (mmb) this.c).W) != null) {
                    CharSequence r = mmbVar.r(hmbVar, false);
                    if (!((mmb) this.c).a()) {
                        findItem3.setVisible(false);
                    } else if (((mmb) this.c).i()) {
                        findItem3.setVisible(true);
                    } else {
                        mmb mmbVar2 = (mmb) this.c;
                        if (mmbVar2.Z || (mmbVar2.u <= 0 && mmbVar2.v >= r.length() - 1)) {
                            findItem3.setVisible(false);
                        } else {
                            findItem3.setVisible(true);
                        }
                    }
                }
                MenuItem findItem4 = menu.findItem(android.R.id.cut);
                if (findItem4 != null) {
                    findItem4.setVisible(((mmb) this.c) instanceof di9);
                }
                MenuItem findItem5 = menu.findItem(android.R.id.paste);
                if (findItem5 != null) {
                    mmb mmbVar3 = (mmb) this.c;
                    if (mmbVar3 instanceof di9) {
                        try {
                            lmb lmbVar = mmbVar3.C;
                            context = lmbVar != null ? lmbVar.getContext() : a.b;
                        } catch (Exception unused) {
                        }
                        if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                            if (clipboardManager.hasPrimaryClip()) {
                                z = true;
                                findItem5.setVisible(z);
                            }
                        }
                    }
                    z = false;
                    findItem5.setVisible(z);
                }
                mmb mmbVar4 = (mmb) this.c;
                if (mmbVar4.k0 == null || mmbVar4.q() == null) {
                    this.b = null;
                    b(menu);
                } else {
                    xqe.b(((mmb) this.c).q().toString(), new ylb(this, menu), new ylb(this, menu), false);
                }
                return true;
        }
    }

    public ut3(xt3 xt3Var, ActionMode.Callback callback) {
        this.a = (byte) 0;
        this.c = xt3Var;
        this.b = callback;
    }

    private final void a(ActionMode actionMode) {
    }
}
