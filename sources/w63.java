// default package

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
