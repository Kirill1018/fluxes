package streams;
import java.io.Serializable;
import java.util.Arrays;
public class Books_ implements Serializable {
	static final long serialVersionUID = 1L;
	public String[] volumes;
	Books_(String[] volumes_) { this.volumes = volumes_; }
	@Override
	public String toString() { return Arrays.toString(this.volumes); }
}