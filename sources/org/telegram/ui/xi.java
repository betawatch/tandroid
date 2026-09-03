package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xi extends ze.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.s1 f;
    public final /* synthetic */ zn g;
    public final /* synthetic */ Object h;

    public /* synthetic */ xi(zn znVar, int i10, Object obj, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.g = znVar;
        this.e = i10;
        this.h = obj;
        this.f = s1Var;
    }

    @Override // ze.c
    public final void c(boolean z4) {
        switch (this.d) {
            case 0:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 17), 240L);
                    break;
                }
                break;
            default:
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new ah.b(this, this.e, 19), 240L);
                    break;
                }
                break;
        }
    }

    @Override // ze.c
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                zn znVar = this.g;
                znVar.tb = i10;
                znVar.ub = 1;
                znVar.vb = (CharacterStyle) this.h;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                zn znVar2 = this.g;
                znVar2.tb = i11;
                znVar2.ub = 3;
                znVar2.wb = (String) this.h;
                this.f.invalidate();
                break;
        }
    }
}
