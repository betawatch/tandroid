// default package

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w63 extends ax2 {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sjf d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w63(sjf sjfVar, ax2 ax2Var) {
        super(ax2Var);
        this.d = sjfVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.O(null, null, this);
    }
}
