class Table
{
	String id;
	int value;
	Table tail;
	
	Table(String i, int v, Table t)
	{
		id = i;
		value = v;
		tail = t;
	}
	
	int lookup(String key)
	{
		if (key.compareTo(id) == 0)  // Se for igual ao id, retorna valor
		{
			return value;
		}

		if (tail == null)
			System.out.println("Hmm...");
		
		return tail.lookup(key);  // Se não, busca no próximo elemento
	}
}