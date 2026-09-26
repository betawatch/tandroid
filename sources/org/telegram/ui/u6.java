package org.telegram.ui;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements org.telegram.ui.Components.dw0, Utilities.Callback2Return, org.telegram.ui.ActionBar.z1, hh.i, org.telegram.ui.Components.jl0, org.telegram.ui.Components.rv0, org.telegram.ui.Components.sv0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.ad0, org.telegram.ui.Components.cd0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u6(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 c(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // org.telegram.ui.Components.sv0
    public void b(Object obj, float f7) {
        as asVar = (as) obj;
        switch (this.a) {
            case 10:
                asVar.b = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    break;
                }
                break;
            case 11:
            case 13:
            default:
                asVar.e = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    break;
                }
                break;
            case 12:
                asVar.c = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    break;
                }
                break;
            case 14:
                asVar.d = f7;
                if (asVar.getParent() != null) {
                    ((View) asVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 4:
                a2Var.dismiss();
                break;
            case 7:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public float get(Object obj) {
        as asVar = (as) obj;
        switch (this.a) {
            case 9:
                return asVar.b;
            case 10:
            case 12:
            default:
                return asVar.e;
            case 11:
                return asVar.c;
            case 13:
                return asVar.d;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // hh.i
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.Components.ad0
    public String j(int i10) {
        switch (this.a) {
            case 20:
                switch (i10) {
                }
            case 24:
                if (i10 != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(1);
                    calendar.add(6, i10);
                    long timeInMillis = calendar.getTimeInMillis();
                    int i12 = calendar.get(1);
                    if (i12 == i11 && i10 < 7) {
                        break;
                    } else if (i12 != i11) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 27:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                break;
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.cd0
    public void q(org.telegram.ui.Components.ed0 ed0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.e5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 17:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 2:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void n() {
    }
}
